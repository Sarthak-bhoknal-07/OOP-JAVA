// hierarchical inheritance - Multiple classes inherit from a single superclass.
// Create a class Employee with the following properties: name (String), employeeId (int)
// Create two subclasses: Developer and Manager

class employee {// Base class
    int empId;
    String name;
}

// Subclass - Developer
class developer extends employee {
    String progLanguage;
    int experienceYears;

    developer() {
        System.out.println("Constructor: developer info");
    }

    public boolean isSenior() {
        if (experienceYears > 5) {
            return true;
        } else {
            return false;
        }
    }
}

// Subclass - Manager
class manager extends employee {
    int teamSize;
    String department;

    manager() {
        System.out.println("Constructor: Manager info");
    }

    public boolean isExecutive() {
        if (teamSize >= 10) {
            return true;
        } else {
            return false;
        }
    }
}

public class inheritance5 {
    public static void main(String[] args) {
        developer d1 = new developer();
        d1.name = "jeson";
        d1.empId = 101;
        d1.progLanguage = "java";
        d1.experienceYears = 7;
        System.out.println("Name: " + d1.name);
        System.out.println("ID: " + d1.empId);
        System.out.println("Language: " + d1.progLanguage);
        System.out.println("Experience: " + d1.experienceYears);
        System.out.println("Senior Developer: " + d1.isSenior());

        System.out.println();

        manager m1 = new manager();
        m1.name = "Bob";
        m1.empId = 201;
        m1.department = "sales";
        m1.teamSize = 8;
        System.out.println("Name: " + m1.name);
        System.out.println("ID: " + m1.empId);
        System.out.println("Department: " + m1.department);
        System.out.println("Team size: " + m1.teamSize);
        System.out.println("Executive Manager: " + m1.isExecutive());
    }
}
