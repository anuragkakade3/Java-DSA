package OOPS;

public class Oops {
    public static void main(String[] args) {
        // Classes & Objects:

        // pen p1 = new pen(); // Creating class name into new Object called p1
        // p1.setColor("Blue"); // Color is changed by using dot operator which called
        // the function
        // System.out.println(p1.Color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.Color = "Yellow"; // Modification is done in the string without calling a
        // function; Only called a
        // // String NAME and assign the value
        // System.out.println(p1.Color);

        // Access Modifiers:

        // BankAccount myAcc = new BankAccount(); // Create a class as a Object to use
        // the funcx
        // myAcc.username = "Anurag";
        // // myAcc.password="1234"; // (Private object can't be accessisable to another
        // // classes )
        // myAcc.setPassword("1234"); // now password is changed by using funcx but
        // can't access the private object

        // Getter & Setter:

        pen p1 = new pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

}

// Access Modifiers:
// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) { // To changing the password into
// another class we create a public function
// inside the private class
// password = pwd;
// }

// }

// Classes & Objects:

// class pen {
// String Color;
// int tip;

// void setColor(String newColor) {
// Color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// }

// Getter & Setter:

class pen {
    private String Color;
    private int tip;

    String getColor() {
        return Color;
    }

    int getTip() {
        return tip;
    }

    void setColor(String Color) {
        this.Color = Color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}