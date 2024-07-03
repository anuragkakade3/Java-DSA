//Check if a number is prime or not

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is Prime No:");
        } else {
            boolean isPrime = true;

            // Optimization for large no's
            for (int i = 2; i <= Math.sqrt(n); i++) {

                // this is for small prime numbers
                // for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is Prime no:");
            } else {
                System.out.println("n is not a Prime no:");

            }
        }
    }
}
