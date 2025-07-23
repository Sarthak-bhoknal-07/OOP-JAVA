// Abstract class and Abstract method

import javax.sound.sampled.SourceDataLine;

abstract class parent {
    public parent() {
        System.out.println("parent class constructor");
    }

    // A concrete method printMsg()
    public void printMsg() {
        System.out.println("This is the message from parent class");
    }

    // ✅ abstract method with no body- must be overridden
    abstract public void greet();

    //
    abstract public void greet2();
}

// The type child must implement the inherited abstract methods
// "Concrete (non-abstract) subclass"
class child1 extends parent {
    public child1() {
        System.out.println("child1 class constructor");
    }

    public void printMsg2() {
        System.out.println("This is the message 2 from child class");
    }

    public void greet() {
        System.out.println("hello");
    }

    public void greet2() {
        System.out.println("hi");
    }
}

// OR make child class abstract
// "abstract subclass"
abstract class child2 extends parent {
    public void greet() {
        System.out.println("Namaste");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.printMsg();
        c1.printMsg2();
        c1.greet();
        c1.greet2();

        // child2 c2 = new child2(); -> GIVES ERROR Bcoz You cannot create an object of
        // an abstract class
    }
}

// abstract class:
// A class declared with the abstract keyword.
// It cannot be directly instantiated (you can't create an object of it).
// It is meant to be inherited (used as a base class).
// Can contain both:
// 1 abstract methods (no body)
// 2 concrete methods (with body)

// Abstract method
// Abstract methods have no body part {}.
// Child classes must override this method.