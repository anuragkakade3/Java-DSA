import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
    }
}
