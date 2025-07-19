//constructor in inheritance

class base {
    public base() {
        // This constructor gets called first when object of derived class is created
        System.out.println("I'm the base class constructor");
    }
}

class derived extends base {
    public derived() {
        // This constructor gets called second
        System.out.println("I'm the derived class constructor");
    }
}

class derivedChild extends derived {
    public derivedChild() {
        // This constructor gets called third (last)
        System.out.println("I'm the constructor child of derived class ");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        // Creating object of derivedChild class
        // This will trigger the constructor chain: base → derived → derivedChild
        derivedChild dc = new derivedChild();
    }
}
