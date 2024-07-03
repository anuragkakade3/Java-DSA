package OOPS;

public class Contructors {

    public static void main(String[] args) {

        Student s1 = new Student();
        // Student s2 = new Student("anurag");
        s1.name = "Anurag";
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // s1 is Copy inside the s2
        s2.password = "xyz";
        s1.marks[2] = 100; // Change is done in the s1. Change is reflect the s2 this is the major problem
                           // of copy contructor.
        System.out.println(s1.name);

        for (int i = 0; i < 3; i++) {

            System.out.println(s2.marks[i]);
        }
    }

}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // Shallow Copy Constructor:

    // Student(Student s1) { // Constructor( [Class name] [object of the class which
    // has to be copied to
    // // other obj])
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks; // Complete array is not copy only refrence is copy to
    // the s2
    // }

    // Deep Copy:

    Student(Student s1) { // Changes is not reflect on the s2
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i]; // s1 is deep copy & this will pass to the s2 as a deep copy of s1
        } // Further changes are not shown on s2

    }

    // Non Parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is Called....");
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println(name);
    }
}