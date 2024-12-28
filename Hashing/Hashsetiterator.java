package Hashing;
import java.util.*;
public class Hashsetiterator {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Mumbai");

        System.out.println(cities);
        
        // Iterator<String> it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(String city: cities){
        //     System.out.println(city);
        // }
        
        
    }
}
