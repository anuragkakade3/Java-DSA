package strings;

public class ShortestPath {

    public static float getShortestPath(String dir) {
        int x = 0, y = 0;
        for (int i = 0; i < dir.length(); i++) {
            char path = dir.charAt(i);
            // North
            if (path == 'N') {
                y++;
            }
            // South
            else if (path == 'S') {
                y--;
            }
            // West
            else if (path == 'W') {
                x--;

            }
            // East
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        System.out.println(getShortestPath(dir));

    }

}
