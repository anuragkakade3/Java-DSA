package Two_D_Array;

public class DiagonalSum {

    public static int diagonal(int matrix[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) { // O(n^2)
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }

        // }

        for (int i = 0; i < matrix.length; i++) { // O(n)

            // primary
            sum += matrix[i][i];
            // secondary
            if (i != matrix[i][matrix.length - 1 - i])
                sum += matrix[i][matrix.length - 1 - i];

        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.print(diagonal(matrix));
    }

}
