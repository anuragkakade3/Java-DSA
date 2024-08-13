import java.util.*;

public class Interleaves {

    public static void interleaves(Queue<Integer> q){
        Queue<Integer> firsthalf=new ArrayDeque<>();
        int size=q.size();

        for(int i=0;i<size/2;i++){
            firsthalf.add(q.poll());
        }

        while(!firsthalf.isEmpty()){
            q.add(firsthalf.poll());
            q.add(q.remove());
        }
    }

    public static void main(String arg[]){
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);q.add(3);q.add(4);q.add(5);q.add(6);q.add(7);
        q.add(8);q.add(9);q.add(10);
        
        interleaves(q);

        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
    }
}
