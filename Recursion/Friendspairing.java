class Friendspairing {
    public static int friendspair(int n) {
        if (n == 1 || n == 2) {
            return n;

        }
        // Single
        int fnm1 = friendspair(n - 1);
        // Pair
        int fnm2 = friendspair(n - 2);
        // Total Ways
        int fn = fnm1 + (fnm1 * fnm2);
        return fn; // friendspair(n-1)+friendspair(n-1)*friendspair(n-2);

    }

    public static void main(String[] args) {
        System.out.println(friendspair(10));
    }
}