package Advance_Pattern;

public class InvertedHalf {

    public static void InvertedHalfno(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // public static void Invertedhald(int n) {
    // // Outer Loop
    // for (int i = 1; i <= n; i++) {
    // // Inner Loop for spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // // Inner loop for Stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }

    public static void main(String[] args) {
        // Invertedhald(7);
        InvertedHalfno(5);
    }

}