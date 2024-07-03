// Question : Use the following sorting algorithms to sort an array in DESCENDING order :
// a. Bubble Sort
// b. Selection Sort
// c. Insertion Sort
// d. Counting Sort
// You can use this array as an example 3, 6, 2, 1, 8, 7, 4, 5, 3, 1

public class Question {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionsort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) { // for index
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }

    }

    public static void Insertionsort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

    }

    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }

        // Orignal Array index iterate
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Frequency array index
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubblesort(arr);
        // selectionsort(arr);
        // Insertionsort(arr);
        countingsort(arr);
        print(arr);

    }

}
