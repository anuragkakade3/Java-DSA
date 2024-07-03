// Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        // double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have a fever");
        }
    }
}