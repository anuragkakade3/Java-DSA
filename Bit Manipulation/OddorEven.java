public class OddorEven {

    public static void oddoreven(int n){
        int bitMast=1;
        if((n & bitMast) == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }

    public static void main(String args[]){
        oddoreven(3);
        oddoreven(4);
        oddoreven(64);
    }
}
