package Two_D_Array;

public class StaicaseSearch {

    public static boolean staircasesearch(int matrix[][], int key) {
        System.out.println();
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key is found in (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("Key is not Found");
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 37, 16 } };

        int key = 33;
        staircasesearch(matrix, key);
    }

}
