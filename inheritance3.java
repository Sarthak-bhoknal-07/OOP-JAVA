// constructor overloading in inheritance ( multilevel inheritance )

class base {// Base (super) class
    public base() {
        System.out.println("I'm the base class constructor");
    }

    // Overloaded constructor with one parameter
    public base(int x) {
        System.out.println("overloaded constructor of base class that prints value of x:" + x);
    }
}

class derived extends base {
    public derived() {
        System.out.println("I'm the derived class constructor");
    }

    // Overloaded constructor with two parameters
    public derived(int x, int y) {
        super(x);
        System.out.println("overloaded constructor of derived class that prints value of y:" + y);
    }
}

class derivedChild extends derived { // Child of derived class (multi-level inheritance)
    public derivedChild() {
        System.out.println("I'm the constructor child of derived class ");
    }

    // Overloaded constructor with three parameters
    public derivedChild(int x, int y, int z) {
        super(x, y);
        System.out.println("overloaded constructor of child of derived class that prints value of z:" + z);
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        // This will call the overloaded constructor of derivedChild
        // Which in turn calls overloaded constructor of derived
        // Which in turn calls overloaded constructor of base
        derivedChild dc = new derivedChild(7, 8, 9);
    }
}
