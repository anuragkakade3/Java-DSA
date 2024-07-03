public class Invertedsecond {
    public static void main(String[] args) {
        int n = 7;

        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
