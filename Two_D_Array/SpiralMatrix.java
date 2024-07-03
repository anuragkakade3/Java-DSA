package Two_D_Array;

public class SpiralMatrix {

    public static void spiralmatrix(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) { // For Odd/Even matrix
            // Top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }

            // Right
            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }

            // Bottom
            for (int j = EndCol - 1; j >= StartCol; j--) {
                System.out.print(matrix[EndRow][j] + " ");
                if (StartRow == EndRow) {
                    break;
                }
            }

            // Left
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                System.out.print(matrix[i][StartCol] + " ");
                if (StartCol == EndCol) {
                    break;
                }
            }
            StartRow++;
            EndCol--;
            StartCol++;
            EndRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralmatrix(matrix);
    }

}
