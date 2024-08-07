import java.util.*;

public class Stacknotes {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //Push
        public static void push(int data){
            list.add(data);
        }

        // Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peak
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    
    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.peak());
            stack.pop();
        }

    
    }

}
