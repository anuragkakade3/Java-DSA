//package OOPS;

public class Abstractclass {
    public static void main(String[] args) {
        Cow c = new Cow();
        // c.eat();
        // c.sleep();
        // System.out.println(c.color);

    }
}

abstract class Anurag {
    String color;

    Anurag() {
        System.out.println("Animal is  Called");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    abstract void eat();
}

class Chicken extends Anurag {

    Chicken() {
        System.out.println("Chicken is  Called");
    }

    void changeColor() {
        color = "Black";
    }

    void eat() {
        System.out.println("Chicken is eating");
    }
}

class Cow extends Chicken {
    void changeColor() {
        color = "Blue";
    }

    Cow() {
        System.out.println("Cow is  Called");
    }

    void eat() {
        System.out.println("Cow is eating");
    }
}
