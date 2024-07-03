// Question 2 : Write a program that reads a set of integers, and then prints
// the sum of the even and odd integers.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;
        int number;
        int choice;

        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }
}