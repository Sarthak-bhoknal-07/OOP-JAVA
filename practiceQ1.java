abstract class pen {
    abstract public void write();

    abstract public void refill();
}

class fountainPen extends pen {
    public void write() {
        System.out.println("Writing by fountain pen");
    }

    public void refill() {
        System.out.println("refilling in fountain pen");
    }

    void changeNib() {
        System.out.println("changing Nib of fountain pen");
    }
}

public class practiceQ1 {
    public static void main(String[] args) {
        fountainPen f1 = new fountainPen();
        f1.write();
        f1.refill();
        f1.changeNib();

        pen p1 = new fountainPen();
        p1.write();
        p1.refill();
        // p1.changeNib(); // ERROR
    }
}