public class Quicksort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // Last element
        int pidx = partition(arr, si, ei);
        // int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1); // Left
        quicksort(arr, pidx + 1, ei); // Right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 5, 2, 8,-4};
        quicksort(arr, 0, arr.length - 1);
        // quicksort(arr, 0, arr.length - 1);
        printarray(arr);

    }
}
