package Hashing;
import java.util.HashMap;


public class Hashmapintro{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert 
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);

        System.out.println(map);

        System.out.println(map.size());

        map.clear();
        System.out.println(map.isEmpty());

}
}
