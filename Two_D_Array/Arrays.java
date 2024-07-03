package Two_D_Array;

import java.util.Scanner;

public class Arrays {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        search(matrix, 5);
    }

}
