package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Keysetnote {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert 
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);   

        Set<String> keys= map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+ ",value="+map.get(k));
        }
}
}