package Hashing;
import java.util.*;
public class Linkedhashsetnote {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Mumbai");

        System.out.println(cities);
        
        LinkedHashSet<String> cities2 = new LinkedHashSet<>();
        cities2.add("Delhi");
        cities2.add("Mumbai");
        cities2.add("Bangalore");
        cities2.add("Chennai");
        cities2.add("Kolkata");
        cities2.add("Mumbai");

        System.out.println(cities2);
        
        
        
    }
}
