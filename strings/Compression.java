package strings;

public class Compression {

    public static String compression(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // Create Integer Object for adding in string
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;

            }
            newString += str.charAt(i);
            if (count > 1) {
                newString += count.toString(); // Integer is convert into string and added to the new string
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }

}
