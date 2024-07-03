package Arrays;

public class TrappedWatter {

    public static int trappedwatter(int height[]) {

        int n = height.length;

        // Calculation of left boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculaton of Right boundry
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedwatter = 0;

        for (int i = 0; i < n; i++) {
            // Calculation of Waterlevel
            int Waterlevel = Math.min(leftMax[i], rightMax[i]);

            // Calculation of Trapped Water
            trappedwatter += Waterlevel - height[i];
        }
        return trappedwatter;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trappedwatter(height));
    }
}
