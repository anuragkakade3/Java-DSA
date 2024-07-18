import java.util.*;

public class Arraylist {

    // public static void swap(ArrayList<Integer>list, int indx1, int indx2){
    //     int temp=list.get(indx1);
    //     list.set(indx1, list.get(indx2));
    //     list.set(indx2, temp);
    // }

    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(5);
        //System.out.println(list); // prints: [1, 2, 3, 4]

        // Reverse array

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " "); // prints: 5 4 3 2 1
        // }

        // Find Max

        // int max= Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.println("Max No. is: " + max);

        // Swap
        
        // int indx1=1, indx2=3;
        // swap(list, indx1, indx2);

        // Sorting

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list); // prints: [1, 2, 3, 4, 5]
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list); // prints: [5, 4, 3, 2, 1]



    }
}
