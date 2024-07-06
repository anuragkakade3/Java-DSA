public class Binarystring {
    public static void binarystring(int n, int lastplace, String str) {
        // Base
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Working for 0
        binarystring(n - 1, 0, str + "0");
        // Working for 1 only when last place is 0 (to avoid double 1)
        if (lastplace == 0) {
            binarystring(n - 1, 1, str + "1");
            return;
        }
    }

    public static void main(String[] args) {
        binarystring(3, 0, "");
    }
}
