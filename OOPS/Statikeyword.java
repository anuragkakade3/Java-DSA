//package OOPS;

public class Statikeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.collegename = "ABC";

        Student s2 = new Student();
        System.out.println(s2.collegename);

    }
}

class Student {

    String name;
    int roll;

    static String collegename;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
