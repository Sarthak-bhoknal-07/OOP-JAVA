// Constructors

class Student {
    int rollNo;
    String name;
    char div;

    // Default constructor: called when no arguments are given
    Student() {
        System.out.println("This is default constructor");
        rollNo = 1;
        name = "Default_Name-xyz";
        div = 'A';
    }

    // Parameterized constructor: called when arguments are passed
    Student(int r, String n, char d) {
        System.out.println("This is parameterized constructor");
        this.rollNo = r;
        this.name = n;
        this.div = d;
    }

    // Copy constructor: creates a new object by copying values from another object
    Student(Student obj) {
        System.out.println("This is copy constructor");
        this.rollNo = obj.rollNo;
        this.name = obj.name;
        this.div = obj.div;
    }

}

public class revision2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.div);

        System.out.println();

        Student s2 = new Student();
        s2.rollNo = 1;
        s2.name = "Sahil";
        s2.div = 'B';
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.div);

        System.out.println();

        Student s3 = new Student(3, "rohan", 'A');
        s3.rollNo = 7;
        System.out.println(s3.rollNo);
        System.out.println(s3.name);
        System.out.println(s3.div);

        System.out.println();

        Student s4 = new Student(s3);
        System.out.println(s4.rollNo);
        System.out.println(s4.name);
        System.out.println(s4.div);
    }
}

// Key Concepts Shown Here
// Constructor Overloading
// Multiple constructors with different parameter lists.

// Default Constructor
// Automatically called if no parameters are provided.

// Parameterized Constructor
// Used to initialize an object with specific values at the time of creation.

// Copy Constructor
// Creates a new object by copying another object’s values