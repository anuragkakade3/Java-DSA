//Print all Primes in a Range

package Functions;

public class Range {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        // for (int i = 2; i <= n - 1; i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optimization done in this line
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void PrimesInRange(int n) { // This is the Helper Function
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // True
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimesInRange(100);
    }

}
