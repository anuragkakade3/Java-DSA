package Arrays;

public class MaxSubarraySum {

    public static void maxsubarraysum(int number[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum=0;  
                for (int k = start; k <= end; k++) {
                    currSum += number[k];

                }
                System.out.println(currSum);
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("Total no of Sum: " + MaxSum);

    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxsubarraysum(number);
    }

}
