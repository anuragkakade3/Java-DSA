package OOPS;

public class Multilevelinheritance {
    public static void main(String[] args) {
        Dogs doggy = new Dogs();
        doggy.eat();
        doggy.legs = 4;
        System.out.println("Legs are "+doggy.legs);
    }
}

class Animals {
    String Color;

    void eat() {
        System.out.println(" Animal is eating");
    }

    void breath() {
        System.out.println("Animal is Breathing");
    }

}

class Mammel extends Animals {
    int legs;

}

class Dogs extends Mammel {
    String bread;

}
