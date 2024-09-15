public class Update {
    
    public static int clearithbit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit==0){
        //     return clearithbit(n, i);
        // }else{
        //     return setithbit(n,i);
        // }

        n=clearithbit(n,i);
        int BitMask=newBit<<i;
        return n | BitMask;
    }

    public static void main(String args[]){
        System.out.println(updateIthBit(10,2, 1));
    }
}


