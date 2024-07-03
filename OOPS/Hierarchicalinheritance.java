package OOPS;

public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.flys();
        b.eat();

    }

}

class Animalse {
    String Color;

    void eat() {
        System.out.println(" Animal is eating");
    }

    void breath() {
        System.out.println("Animal is Breathing");
    }

}

class Mammels extends Animalse {// Original class is extends
    int legs;

}

class Dog extends Animalse {// Original class is extends
    String bread;

}

class Bird extends Animalse { // Original class is extends
    void flys() {
        System.out.println("Animal is Flying");
    }

}
