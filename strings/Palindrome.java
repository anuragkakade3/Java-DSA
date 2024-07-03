package strings;

public class Palindrome {
    public static boolean isPalindrom(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("String is not Prlindrome ");
                return false;
            }

        }
        System.out.print("String is Palindrome: ");
        return true;

    }

    public static void main(String[] args) {
        String str = "Anurag";
        System.out.println(isPalindrom(str));
    }

}
