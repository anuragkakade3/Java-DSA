public class Opmitizedpower {
    public static int optimizedpoer(int x, int n) { // O(logn)
        if (n == 0) {
            return 1;
        }
        int halfpwr = optimizedpoer(x, n / 2);
        int halfpwrsqr = halfpwr * halfpwr;
        
        // for odd
        if (n % 2 != 0) {
            halfpwrsqr = x * halfpwrsqr;
        }
        return halfpwrsqr;
    }

    public static void main(String[] args) {
        int x = 8;
        int n = 10;
        System.out.println(optimizedpoer(x, n));
    }

}
