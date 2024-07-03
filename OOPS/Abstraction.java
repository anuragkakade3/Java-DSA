package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
        c.sleep();

        Chicken h = new Chicken();
        h.eat();
        h.sleep();
    }
}

abstract class Animal {

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    abstract void eat();
}

class Chicken extends Animal {
    void eat() {
        System.out.println("Chicken is eating");
    }
}

class Cow extends Animal {
    void eat() {
        System.out.println("Cow is eating");
    }
}
