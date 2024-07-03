public class Calsum {
    public static int calsum(int n) {
        if (n == 1) {
            return 1;
        }
        int sumnm1 = calsum(n - 1);
        int sum = sumnm1 + n;
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calsum(n));
    }

}
