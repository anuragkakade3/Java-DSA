
public class ReverseNo {
    public static void main(String[] args) {

        int n = 20022003;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();

    }
}