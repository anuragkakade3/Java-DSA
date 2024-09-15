public class Countset {
    
    public static int clearLbit(int n){
        int count=0;
        while(n>0){
            if((n&1) != 0){ //check out LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }


    public static void main(String args[]){
        System.out.println(clearLbit(15));
    }
}


