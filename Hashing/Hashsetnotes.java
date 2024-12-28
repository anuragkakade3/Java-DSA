package Hashing;
import java.util.*;
public class Hashsetnotes {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20);
        hs.add(10);

        System.out.println(hs); // [10, 20, 30]
        if(hs.contains(20)){
            System.out.println("20 is present");
        }
    }
}
