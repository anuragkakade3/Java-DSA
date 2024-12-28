package Hashing;
import java.util.*;
public class Itinerary {

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revmap = new HashMap<>();

        for(String key : tickets.keySet()){
            revmap.put(tickets.get(key), key);
        }
        
        for(String key : tickets.keySet()){
            if(!revmap.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();

    }
}
