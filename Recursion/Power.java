public class Power {
    public static int ispower(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1= ispower(x,n-1);
        int xn= x* xnm1;
        return xn;

        //return x * ispower(x, n-1);
    }

    public static void main(String[]args){
        System.out.println(ispower(2,10));
    }
    
}
