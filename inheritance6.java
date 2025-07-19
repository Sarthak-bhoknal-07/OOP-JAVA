// this and super keyword
// 'this'-> The this keyword refers to the current object of the class where it is used.
// 'super'-> The super keyword refers to the immediate parent class of the current class.

// imp question -Why can we create only derived class constructors, and not the base class constructor, in inheritance?
// ans-> Constructors are not inherited.
// A derived (subclass) must ensure the base (superclass) is properly constructed first.
// That means: Before the subclass constructor runs, the superclass constructor must run.

import java.nio.channels.Pipe.SourceChannel;
import java.rmi.server.SocketSecurityException;

class class1 {
    int a;

    public class1() {
        System.out.println("This is base class constructor");
    }

    public class1(int a) {
        System.out.println("this overloaded base class constructor");
        // This differentiates the instance variable a from the constructor parameter
        this.a = a;
    }

    public int geta() {
        return a;
    }

    public void seta(int a) {
        this.a = a;
    }

}

class class2 extends class1 {
    int b;

    class2() {
        System.out.println("this is derived class constructor");
    }

    class2(int x) {
        super(x);
        System.out.println("This is overloaded derived class constructor");
    }

    public void setb(int b) {
        this.b = b;
    }

    public int getb() {
        return b;
    }
}

public class inheritance6 {
    public static void main(String[] args) {
        class1 obj1 = new class1(10);
        System.out.println(obj1.geta());

        System.out.println();

        class2 c1 = new class2();
        c1.seta(17);
        System.out.println(c1.geta());

        System.out.println();

        class2 c2 = new class2(20);
        System.out.println(c2.geta());
    }
}

// Java doesn't automatically provide a no-arg (default) constructor if any
// constructor (parametarized/copy) is already defined.
