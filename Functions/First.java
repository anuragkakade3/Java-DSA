//package Functions;

import java.util.Scanner;

public class First {
    public static void printmethod() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static /* void */ int calculate(int num1, int num2) { // Parameters or formal Parameters
        int sum = num1 + num2;
        // System.out.println("Sum is:" + sum);
        return sum;
    }

    public static void main(String[] args) {
        // printmethod();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // calculate(a, b);
        int sum = calculate(a, b); // Arguments or Actual Parameters
        System.out.println("Sum is:" + sum);

    }

}
