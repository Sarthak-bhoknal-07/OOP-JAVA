class student {
    int rollno;
    String name;

    // Default Constructor
    public student() {
        rollno = 1;
        name = "Default_name-xyz";
    }

    // Copy Constructor
    public student(student stud) {
        this.rollno = stud.rollno;
        this.name = stud.name;
    }

    public void printInfo() {
        System.out.println(rollno);
        System.out.println(name);
    }

    public void setRoll(int r) {
        this.rollno = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        // Create s1, set custom values
        // Create s2 using the copy constructor (copies s1's values)

        student s1 = new student();
        s1.setRoll(7);
        s1.setName("jeson");
        s1.printInfo();

        student s2 = new student(s1);
        s2.printInfo();

    }
}
