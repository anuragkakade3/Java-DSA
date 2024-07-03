//Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100 != 0);
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println("Leap year");

        } else {
            System.out.println("Not a leap year");
        }
    }
}

/*
 * 
 * Leap Year Rules:
 * 
 * 1] A year is a leap year if it is divisible by 4.
 * 2] However, if the year is also divisible by 100, it is not a leap year
 * unless it is also divisible by 400.
 * 
 * These rules ensure that the average length of a year is close to the actual
 * solar year.
 * 
 * Logical Breakdown:
 * 
 * Divisibility by 4:
 * year % 4 == 0: This checks if the year is divisible by 4. If true, the year
 * is a candidate for being a leap year.
 * 
 * Divisibility by 100:
 * year % 100 != 0: This checks if the year is not divisible by 100. If true,
 * the year is not a century year and thus a leap year.
 * 
 * Divisibility by 400:
 * year % 400 == 0: This checks if the year is divisible by 400. If true, even a
 * century year (divisible by 100) is a leap year.
 * 
 * Combined Condition
 * (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0):
 * 
 * This combines the rules: the year must be divisible by 4 and (either not
 * divisible by 100 or divisible by 400).
 * 
 * By using this combined condition, the code correctly determines whether the
 * entered year is a leap year or not according
 * to the Gregorian calendar rules.
 * 
 */