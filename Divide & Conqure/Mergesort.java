public class Mergesort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergsort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // Recursive funx calls
        int mid = si + (ei - si) / 2; // Calculating Mid
        mergsort(arr, si, mid); // Left Part
        mergsort(arr, mid + 1, ei); // Right Part
        merge(arr, si, mid, ei); // Merge the part to call the Funx
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Calculating size of temp array it always same
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) { // Comparisons btw 2 merge parts in ascending order
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to Orignal arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 5, 2, 8, -4 };
        mergsort(arr, 0, arr.length - 1);
        printarray(arr);

    }
}
