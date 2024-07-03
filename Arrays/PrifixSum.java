package Arrays;

public class PrifixSum {

    public static void prifixsum(int number[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prifix[] = new int[number.length];

        prifix[0] = number[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;

                currSum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        prifixsum(number);

    }
}
