// Question 5 : Write a Java method to compute the sum of the digits in an integer.

package Functions;

import java.util.Scanner;

public class SumInteger {

    public static int IsSuminteger(int n) {
        int sumofdigit = 0;
        while (n > 0) {
            int digit = n % 10;
            sumofdigit = sumofdigit + digit;
            n = n / 10;
        }
        return sumofdigit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no:");
        int n = sc.nextInt();

        System.out.println("The sum of the no is " + IsSuminteger(n));

    }

}
