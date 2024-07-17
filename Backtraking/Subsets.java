public class Subsets {
    
    public static void findsubsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.err.print("Null");
            }else{
            System.err.println(ans);
            }return;
        }
        
        // If choice is Yes
        findsubsets(str, ans+str.charAt(i), i+1);
        // If choice is NO
        findsubsets(str, ans, i+1);
    }

    public static void main(String[]args){
        String str="abc";
        findsubsets(str,"",0); 
    }
}
