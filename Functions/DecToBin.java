package Functions;

public class DecToBin {
    public static void dectobin(int n) {
        int mynum = n;
        int pow = 0;
        int BinNum = 0;

        while (n > 0) {
            int rem = n % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println("Binary form of " + mynum + " = " + BinNum);

    }

    public static void main(String[] args) {
        dectobin(7);
    }
}
