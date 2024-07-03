public class Selection {

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Sorted Array (Outer loop) for index
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) { // Unsorted array (Inner Loop)
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection(arr);
        print(arr);
    }
}
