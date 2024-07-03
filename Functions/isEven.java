// Question 2 : Write a method named isEven that accepts an int argument. The
// method should return true if the argument is even, or false otherwise.
// Also write a program to test your method.

package Functions;

import java.util.Scanner;

public class isEven {
    public static boolean even(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(even(n));

    }
}