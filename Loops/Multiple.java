//Keep entering numbers till user enters a multiple of 10

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your no:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.print(n);
        } while (true);

    }
}
