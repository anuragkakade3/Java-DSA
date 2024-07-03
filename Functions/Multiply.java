package Functions;

public class Multiply {

    public static int Multiplication(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int total = Multiplication(a, b);
        System.out.println("a * b = " + total);
        total = Multiplication(5, 3);
        System.out.println("a *  b = " + total);

    }
}
