import java.util.*;

public class Pairsum1 {

    public static boolean pairsum(ArrayList<Integer> list, int target){
        for(int i=0;i<list.size();i++){
            for(int j=0; j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;

    }
    
    public static void main(String[]args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target=5;

        System.out.println(pairsum(list,target));
    }
    
}
