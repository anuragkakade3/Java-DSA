import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoinSystem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins=0;
        System.out.println("Enter the amount:");
        int amount=sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                countOfCoins++;
                ans.add(coins[i]);
                amount-=coins[i];
            }
        }
    }

    System.out.println("Total (min) coins used = " + countOfCoins);

    for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i) + " ");
    }
    System.out.println();
    }
}
