import java.util.*;

public class Duplicateparenthese {
    
    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>();

        for(int i=0; i<str.length();i++){
            char ch =str.charAt(i);

            //Closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate
                }else{
                    s.pop(); // remove opening parenthesis
                }
            }else{
                //Opening
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String[]args){
        String str="((a+b))";// true
        String str2="(a-b)";// false
        System.out.println(isDuplicate(str2));
    }
}
