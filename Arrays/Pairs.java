package Arrays;

public class Pairs {

    public static void pairs(int number[]) {
        int totalpairs = 0;

        for (int i = 0; i < number.length; i++) { // Outer loop for cuurent no
            int currentno = number[i]; // 1,2,3,4,5
            for (int j = i + 1; j < number.length; j++) { // Inner loop for pairing no
                System.out.print("(" + currentno + "," + number[j] + ")");
                totalpairs++; // Arithematic Progrretion Formula (Optimization)
            }
            System.out.println();
        }
        System.out.print("Total no os Pairs: " + totalpairs);

    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        pairs(number);
    }
}
