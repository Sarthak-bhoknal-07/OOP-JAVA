// Polymorphism 
// 1] Compile Time - method overloading (Same class, Same method name, return type but different parameteers )
// 2] Run Time method overriding (same name, same parameter but in different class /child class)

class parentClass {
    public void meth1() {
        System.out.println("This is method 1 in parent class");
    }

    public void meth1(int x) {
        System.out.println(x);
        System.out.println("This is overloaded method 1 in parent class");
    }

    public void meth1(int x, int y) {
        System.out.println(x);
        System.out.println(y);
        System.out.println("This is overloaded method 1 in parent class");
    }

    public void meth2() {
        System.out.println("This is method 2 in parent class");
    }

    public void meth3() {
        System.out.println("This is method 3 in parent class");
    }
}

class childClass extends parentClass {
    public void meth1() {
        System.out.println("this is overriden method in childClass");
    }

    public void meth1(int a) {
        System.out.println(a);
        System.out.println("this is overriden method in childClass");
    }

    public void meth4() {
        System.out.println("This is method 4 in child class");
    }

    public void meth5() {
        System.out.println("This is method 5 in child class");
    }
}

public class revision5 {
    public static void main(String[] args) {
        parentClass p1 = new parentClass();
        p1.meth1();
        p1.meth1(10);
        p1.meth1(10, 20);

        childClass c1 = new childClass();
        c1.meth1();
        c1.meth1(10);

        System.out.println();

        // Dynamic method dispatch
        // reference type is parent class, but actual object is childclass
        parentClass p2 = new childClass();
        p2.meth1();
        p2.meth2();
    }
}
