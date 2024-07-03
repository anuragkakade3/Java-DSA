// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less than or equal 0");
        }
    }
}
