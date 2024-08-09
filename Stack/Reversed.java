import java.util.*;

public class Reversed {
    public static void pushBottom(Stack<Integer>stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        
        }
        int top=stack.pop();
        pushBottom(stack, data);
        stack.push(top);
    }


    public static void revesrestack(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int temp=stack.pop();
        revesrestack(stack);
        pushBottom(stack, temp);
    }

    public static void printStack(Stack<Integer>stack){
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }

    public static void main(String[]args){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // 1->2->3
        // 3->2->1
        //Bottom:- 1->2->3 

        revesrestack(stack);
        printStack(stack);
    }
}
