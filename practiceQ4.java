interface TVRemote {
    void meth1();
}

interface smartTVRemote extends TVRemote {
    void meth2();

    void meth3();
}

class Tv implements TVRemote {
    public void meth1() {
        System.out.println("In TV, method 1 from TV Remote interface");
    }
}

// A class implementing a child interface must implement all parent interface
// methods.
class SmartTv implements smartTVRemote {
    public void meth2() {
        System.out.println("In smartTV, method 2 from SmartTVRemote interface");
    }

    public void meth3() {
        System.out.println("In smartTV, method 3 from SmartTVRemote interface");
    }

    public void meth1() {
        System.out.println("In smartTV, method 1 from TVRemote interface");
    }
}

public class practiceQ4 {
    public static void main(String[] args) {
        // Reference type decides which methods you can call.
        smartTVRemote s1 = new SmartTv();
        s1.meth1();
        s1.meth2();
        s1.meth3();

        TVRemote t1 = new Tv();
        t1.meth1();
    }
}
