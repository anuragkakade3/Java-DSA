// What will be the value of x & y in the following program:

public class Turnary {
    public static void main(String args[]) {
        int a = 63;
        int b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println(x);
        System.out.println(y);
    }
}