// Access Modifiers: public, private, protected, default

class MyEmployees {
    private int id; // private: only accessible within this class
    private String name;
    protected String password; // protected: accessible in same package and by subclasses

    // protected setter & getter: allows access within same package and subclasses
    protected void setId(int i) {
        this.id = i;
    }

    protected int getId() {
        return id;
    }

    // public setter & getter: accessible from anywhere
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        MyEmployees emp1 = new MyEmployees();
        // sahil.id = 101; //Error: 'id' has private access in 'MyEmployees'
        // To access use setter and getter

        emp1.setId(101); // Allowed: setId() is protected, main() is in same package
        System.out.println(emp1.getId());
        emp1.setName("sahil"); // setName() is public, accessible everywhere
        System.out.println(emp1.getName());

        // 'password' is protected and this class is in the same package,
        // so it's accessible here
        emp1.password = "xyz";
        System.out.println("Password set successfully"); // Just confirmation
    }
}
