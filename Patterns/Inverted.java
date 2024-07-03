public class Inverted {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
