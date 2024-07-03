
//Question 1 : Write a Java method to compute the average of three numbers.

package Functions;

import java.util.Scanner;

public class Average {

    public static int average(int a, int b, int c) {

        return (a + b + c) / 3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of the no is  " + average(a, b, c));
    }

}
