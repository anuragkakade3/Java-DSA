class TailingProblem {
    public static int tailingproblem(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Working
        int verticletailing = tailingproblem(n - 1);
        int horizontaltailing = tailingproblem(n - 2);

        // Total ways
        int totalways = verticletailing + horizontaltailing;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tailingproblem(4));
    }
}