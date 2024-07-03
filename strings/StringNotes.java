package strings;

import java.util.Scanner;

public class StringNotes {

    public static void loop(String Name) {
        for (int i = 0; i <= Name.length(); i++) {
            System.out.print(Name.charAt(i) + " ");
        }
        System.out.println();
    }

    // Substring:

    public static String getsubstring(String s1, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s1.charAt(i);

        }
        return substr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String Name;
        // Name = sc.nextLine();// Complete Line
        // sc.next(); [ For only first char]
        // String nickname = "AK";
        // Concatenation
        // System.out.println(Name + " Nick name is: " + nickname);
        // System.out.println(Name.length());

        // Print First Letter at 0th Index
        // System.out.println(Name.charAt(0));

        // Loop Function
        // loop(Name);

        // Compare:

        // String s1 = "ABC";
        // String s2 = "ABC";
        // String s3 = new String("ABC");
        // if (s1 == s2) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }

        // if (s1 == s3) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }

        // if (s1.equals(s3)) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }

        // Substring:

        String s1 = "HelloWorld";
        // System.out.println(getsubstring(s1, 0, 5)); // Hello

        // Shortcut for Substring
        // System.out.println(s1.substring(0, 5)); // Hello

        // Dexicographie ( Compare To Function)
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0]; // Considering First letter as big
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) { // We dont want smallest string
                largest = fruits[i]; // large letter assign in string
            }
        }
        System.out.println(largest);

    }

}
