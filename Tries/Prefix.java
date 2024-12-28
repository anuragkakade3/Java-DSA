package Tries;
import java.util.*;
public class Prefix {
    
        static class Node {
            Node children[] = new Node[26]; // 'a'-'z'
            boolean eow = false;
            int freq;

            public Node() {
                for (int i = 0; i < children.length; i++) {
                    children[i] = null;
                }
                freq = 0; // Initialize freq to 0
            }
    
        }
        public static Node root = new Node();
    
        public static void insert(String word) {
            Node curr = root;
            for (int level = 0; level < word.length(); level++) {
                int index = word.charAt(level) - 'a';
                if (curr.children[index] == null) {
                    curr.children[index] = new Node();
                }
                curr.children[index].freq++; // Increment frequency
                curr = curr.children[index];
            }
            curr.eow = true;
        }
    
        public static boolean search(String key){
            Node curr = root;
            for (int level = 0; level < key.length(); level++) {
                int index = key.charAt(level) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.eow == true;
        }
    
        public static void findPrefixes(Node root, String prefix, List<String> result) {
            if (root == null) {
                return;
            }
            if (root.freq == 1) {
                result.add(prefix);
                return;
            }
            for (char c = 'a'; c <= 'z'; c++) {
                int index = c - 'a';
                if (root.children[index] != null) {
                    findPrefixes(root.children[index], prefix + c, result);
                }
            }
        }

        public static List<String> getPrefixes(String[] words) {
            List<String> result = new ArrayList<>();
            for (String word : words) {
                insert(word);
            }
            findPrefixes(root, "", result);
            return result;
        }
    
        public static void main(String[] args) {
            String arr[] = { "zebra", "dog", "duck", "dove" };
            List<String> prefixes = getPrefixes(arr);
            System.out.println(prefixes);
        }
    }


