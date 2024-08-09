import java.util.*;

public class ReverseStack {
    public static String reversestring(String str){
        Stack<Character> stack=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){

            char curr=stack.pop();
            sb.append(curr);

            
            // To print the reversed string in reverse order without using extra space
            //sb.append(stack.pop());
        }

        return sb.toString() ;
    }   

    public static void main(String[] args) {
        String str="abcdefg";
        String result=reversestring(str);
        System.out.println(result);
    }
}
