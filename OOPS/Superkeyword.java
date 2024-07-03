
class Superkeyword {
  public static void main(String args[]) {
    Dog d = new Dog();

  }
}

class Animal {

  Animal() {
    System.out.println("Animal is called...");
  }
}

class Dog extends Animal {

  Dog() {
    super();
    System.out.println("Dog is called...");
  }

}
