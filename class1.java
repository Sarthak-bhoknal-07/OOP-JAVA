// Class and Object

class employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("The id is " + id);
        System.out.println("The name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class class1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        employee emp1 = new employee(); // emp1 is a object of employee class
        employee emp2 = new employee(); // emp2 is a object of employee class

        // setting properties/attributes
        emp1.id = 101;
        emp1.name = "Sarthak";
        emp1.salary = 20000;

        emp2.id = 102;
        emp2.name = "Sahil";
        emp2.salary = 40000;

        // printing
        // System.out.println(emp1.id);
        // System.out.println(emp1.name);
        emp1.printDetails();
        System.out.println("salary: " + emp1.getSalary());
        emp2.printDetails();
        System.out.println("Salary: " + emp2.getSalary());
    }
}
