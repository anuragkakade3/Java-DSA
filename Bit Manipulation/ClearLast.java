public class ClearLast {
  
    public static int clearLbit(int n, int i){
        int bitmask= (~0)<<i;
        return n & bitmask;
    }


    public static void main(String args[]){
        System.out.println(clearLbit(15,2));
    }
}


