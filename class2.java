// Basic OOP question-1

class employee {
    int salary;
    String name; // by default "null" if not defined

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}

public class class2 {
    public static void main(String arg[]) {
        employee emp1 = new employee();
        emp1.salary = 3000;
        emp1.name = "sarthak";

        System.out.println("name is " + emp1.getName());
        emp1.setName("sarth");
        System.out.println("Updated name is: " + emp1.getName());
        System.out.println("salary is " + emp1.salary);
    }
}
