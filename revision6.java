// Abstraction

abstract class parentClass {
    String name = "Sahil";

    parentClass() {
        System.out.println("This is parent class constructor");
    }

    abstract public void method1();

    abstract public int method2();

    public void greet() {
        System.out.println("Hello Guys");
    }

    public void printName() {
        System.out.println(name);
    }
}

class child extends parentClass {
    int x = 10;

    child() {
        System.out.println("This is child class constructor");
    }

    public void method1() {
        System.out.println("This is abstract method 1 of parentclass, overriden in child");
    }

    public int method2() {
        return x;
    }
}

public class revision6 {
    public static void main(String[] args) {
        child c1 = new child();
        c1.method1();
        System.out.println(c1.method2());
        c1.greet();

        parentClass p1 = new child();
        p1.method1();
        System.out.println(p1.method2());
        p1.greet();
        p1.printName();
    }
}
