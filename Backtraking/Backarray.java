class Backarray{

    public static void backArr(int arr[],int i,int val){
        // Base
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // Recursion
        arr[i]=val;
        backArr(arr,i+1,val+1);
        arr[i]=arr[i]-2; // Backtrack operation 
        
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");  //Printing array elements in reverse order.
        }
        System.out.println();  //To print a new line after printing array.
        
    }
    public static void main(String[]args){
        int arr[]=new int[5];
        backArr(arr,0,1);
        printArr(arr);  //To print array elements in original order.

    }

}