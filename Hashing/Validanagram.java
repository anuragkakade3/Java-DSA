package Hashing;

import java.util.HashMap;

public class Validanagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(map.get(c)!=null){
                if(map.get(c)==1){
                    map.remove(c);
                }else{
                    map.put(c,map.get(c)-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }


    public static void main(String[] args) {
        String s = "tuplip";
        String t = "lipid";
        System.out.println(isAnagram(s, t));
    }
}
