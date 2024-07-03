package Arrays;

public class ArrayCC {

    // Call by Refrence

    // public static void change(int mark[]) {
    // for (int i = 0; i < mark.length; i++) {
    // mark[i] = mark[i] + 1;
    // }
    // }

    // Linear Search

    // public static int linearSearch(int arr[], int key) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // Largest Number

    public static int lagest(int number[]) {
        int Largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }
            if (Smallest > number[i]) {
                Smallest = number[i];
            }
        }

        System.out.println("Smallest Value is " + Smallest);
        return Largest;
    }

    public static void main(String[] args) {

        // Notes:

        // Scanner sc =new Scanner(System.in);
        // int marks[]=new int[50];
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // System.out.println("Phy: "+ marks[0]);
        // System.out.println("Math: "+ marks[1]);
        // // marks[1]=marks[1]+1;
        // // System.out.println("Math: "+ marks[1]);
        // int percentage=(marks[0]+ marks[1])/2;
        // System.out.println("Percentage: "+ percentage);
        // System.out.println(marks.length);

        // Call By Refrence:

        // int mark[] = { 97, 98, 99 };
        // change(mark);
        // for (int i = 0; i <= mark.length; i++) {
        // System.out.print(mark[i] + " ");
        // }
        // System.out.println();

        // Linear Search

        // int arr[] = { 2, 4, 6, 8, 10, 12, 14, 18, 16 };
        // int key = 10;
        // int index = linearSearch(arr, key);
        // if (index == -1) {
        // System.out.println("NOT Found");
        // } else {
        // System.out.println("Found at index: " + index);
        // }

        // Largest Number:

        int number[] = { 1, 2, 6, 5, 3 };
        System.out.println("Largest Value is " + lagest(number));
    }
}
