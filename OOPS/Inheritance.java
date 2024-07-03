package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }

}

class Animal {
    String Color;

    void eat() {
        System.out.println("Animal is eating");
    }

    void breath() {
        System.out.println("Animal is Breathing");
    }
}

class Fish extends Animal { // extends are use for extend animal class into the derived class / Child class.
    int fins;

    void swim() {
        System.out.println("Animal is Swiming");
    }
}
