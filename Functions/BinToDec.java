package Functions;

public class BinToDec {

    public static void binTodec(int BinNum) {
        int MyNum = BinNum;
        int Pow = 0;
        int Dec = 0;

        while (BinNum > 0) {
            int Lastdigit = BinNum % 10;
            Dec = Dec + (Lastdigit * (int) Math.pow(2, Pow));

            Pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of " + MyNum + " is = " + Dec);
    }

    public static void main(String[] args) {
        binTodec(101);
    }

}
