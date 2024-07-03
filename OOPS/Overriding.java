package OOPS;

public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Pig {
    void eat() {
        System.out.println(" Animal is eating");
    }
}

class Deer extends Pig {
    void eat() {
        System.out.println(" Animal is eating Grass");
    }
}
