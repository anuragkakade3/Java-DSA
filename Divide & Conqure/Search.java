public class Search {
    public static int search(int arr[], int target, int si, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }

        // Calculate mid index
        int mid = si + (ei - si) / 2;

        // If target is present at mid
        if (arr[mid] == target) {
            return mid; // Separating L1 & L2
        }
        // Mid is on L1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // Case b: right
                return search(arr, target, mid + 1, ei);
            }
            // Mid is on L2
        } else {
            // Case c : Right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Case d: Left
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int idx = search(arr, target, 0, arr.length - 1);
        System.out.println("Element is present at index " + idx);

    }
}
