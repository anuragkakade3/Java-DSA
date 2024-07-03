// Question 3 : Write a Java program to check if a number is a palindrome in
// Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a
// number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321
// is not a
// pelindrome because the reverse of 121 which is not equal to 321.

package Functions;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int reminder = palindrome % 10; // Select last digit
            reverse = reverse * 10 + reminder; // Logic
            palindrome = palindrome / 10; // Remove the last digit

        }
        if (n == reverse) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("The Number " + n + " is Palindrome.");
        } else {
            System.out.println("The Number " + n + " is not Palindrome.");
        }

    }

}
