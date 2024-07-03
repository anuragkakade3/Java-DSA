package Advance_Pattern;

import java.util.Scanner;

public class InvertedNo {

    public static void InvertedHalfno(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InvertedHalfno(n);
    }

}
