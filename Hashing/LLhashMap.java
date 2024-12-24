package Hashing;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LLhashMap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("US",50);

        // TreeMap<String,Integer> tm = new TreeMap<>();
        // tm.put("India",100); 
        // tm.put("China",150);
        // tm.put("US",50);


        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        
        // System.out.println("LinkedHashMap: "+tm);

        System.out.println("LinkedHashMap: "+map);
        System.out.println("HashMap: "+hm);

        //LinkedHashMap maintains insertion order
        //HashMap does not maintain insertion order
        //So, LinkedHashMap can be used for maintaining order of insertion in case of key-value pairs.

        //It uses a doubly-linked list to maintain the order of insertion.
        //The get operation in LinkedHashMap is faster than in HashMap because it doesn't require rehashing.

        //LinkedHashMap maintains the order of insertion, which is useful in some cases.
        //For example, in a stack or queue implementation, the order of insertion matters.

        //However, it does not provide constant time complexity for get operation as it uses a doubly-linked list.
        //So, it's not suitable for scenarios where frequent get operations are needed.

        //In summary, LinkedHashMap is useful when maintaining the order of insertion in a HashMap,

    }
}
