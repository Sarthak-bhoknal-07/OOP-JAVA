// interface inheritance and default methods.
// interfaces can extends another interfaces

interface baap {
    void meth1();

    void meth2();

    default void methX() {
        System.out.println("This is default methodX in baap interface");
    }
}

interface baap2 {
    void meth3();
}

// 🔹 Interface 'porya' extends both baap and baap2 (multiple inheritance)
interface porya extends baap, baap2 {
    void meth4();

    void meth5();

    default void methY() {
        System.out.println("This is default methodY in porya interface");
    }
}

// 🔹 Class implementing child interface 'porya'
class sampleClass implements porya {
    // Must override all abstract methods from:
    // - baap: meth1, meth2
    // - baap2: meth3
    // - porya: meth4, meth5

    public void meth5() {
        System.out.println("this is method 5");
    }

    public void meth4() {
        System.out.println("this is method 4");
    }

    public void meth1() {
        System.out.println("this is method 1");
    }

    public void meth2() {
        System.out.println("this is method 2");
    }

    public void meth3() {
        System.out.println("this is method 3");
    }

    public void itsOwnMethod() {
        System.out.println("method of sample class");
    }
}

public class interface8 {
    public static void main(String[] args) {
        sampleClass s1 = new sampleClass();
        // Call all methods
        s1.meth1(); // from baap
        s1.meth2(); // from baap
        s1.meth3(); // from baap2
        s1.meth4(); // from porya
        s1.meth5(); // from porya
        s1.methX(); // default from baap
        s1.methY(); // default from porya
        s1.itsOwnMethod();
    }
}
