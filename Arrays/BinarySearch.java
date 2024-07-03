package Arrays;

public class BinarySearch {
    public static int binarysearch(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2; // to find Mid Element in array
            // Comparisons

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // right (mid=8, key=10) (8 < 10)
                start = mid + 1;
            } else { // Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 16 };
        int key = 10;

        System.out.println("Index for key is: " + binarysearch(number, key));
    }

}
