// Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your no:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Your no was" + n);
        } while (true);

    }
}