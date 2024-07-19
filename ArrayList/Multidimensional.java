import java.util.*;

public class Multidimensional {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
        ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Integer>List2=new ArrayList<>();
        ArrayList<Integer>List3=new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            List1.add(i);
            List2.add(i*2);
            List3.add(i*3);
        }
        
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);
    
        System.out.println("Main ArrayList: " + MainList);

        // Print Individual AL

        for(int i=0; i<MainList.size();i++){
            ArrayList<Integer>currArr=MainList.get(i);
            for(int j=0;j<currArr.size();j++){
                System.out.print(currArr.get(j) + " ");
            }
            System.out.println();
        }
    
    }
    
}
