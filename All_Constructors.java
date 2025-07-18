import java.util.*;

class Myemployees {
    private int id;
    private String name;
    private boolean promoted = false;

    // 1] Non-Parameterized / Default Constructor - setting default values.
    // Setter methods being used to override those default values.
    // Getter methods being used to retrieve and display those values

    public Myemployees() {
        id = 101; // Default value assigned
        name = "Default_Name_xyz";
        promoted = false;
    }

    // Parameterized Constructor
    public Myemployees(int empId, String empName, boolean isPromoted) {
        id = empId;
        name = empName;
        promoted = isPromoted;
    }

    // Constructor Overloading means having multiple constructors in the same class
    // with different parameter lists. It allows objects of a class to be
    // initialized in different ways.

    public Myemployees(int empId, String empName) {
        id = empId;
        name = empName;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setPromotedOrNot(boolean x) {
        promoted = x;
    }

    public boolean getPromotedOrNot() {
        return promoted;
    }
}

public class All_Constructors {
    public static void main(String[] args) {
        // same default constructor but having different values after using setters.
        // obj1 - gives default values as a output BCOZ not set any-other values to them
        // obj2 - gives seted values 102 & Sarthak BCOZ setter methods overrides those
        // default values

        Myemployees obj1 = new Myemployees();
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj1.getPromotedOrNot());

        Myemployees obj2 = new Myemployees();
        obj2.setId(102);
        obj2.setName("Sarthak"); // if this '//'commented then it's also gives default values
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());

        // Paramaterized Constructor
        Myemployees obj3 = new Myemployees(103, "Parameter_Name");
        // Setters can overriding even parameterized values
        // obj3.setId(104);
        // obj3.setName("rahul");
        System.out.println(obj3.getId());
        System.out.println(obj3.getName());

        Myemployees obj4 = new Myemployees(104, "Rohan", true);
        System.out.println(obj4.getId());
        System.out.println(obj4.getName());
        System.out.println("Promoted (true) / Not promorted (false): " + obj4.getPromotedOrNot());
    }
}