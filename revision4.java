// Constructor in inheritance

class Phone {
    int x;
    int a = 100;

    Phone() {
        System.out.println("This is Phone - Default constructor");
    }

    Phone(int x) {
        this.x = x;
    }

    public void receiveCall() {
        System.out.println("recieving call...");
    }

    public void cutCall() {
        System.out.println("cut the call...");
    }
}

class SmartPhone extends Phone {
    int y;
    int a = 200;

    SmartPhone() {
        // Implicitly calls super()
        System.out.println("This is SmartPhone - Default constructor");
    }

    SmartPhone(int x, int y) {
        // super(x) is not a value or expression – it’s a special statement that calls
        // the parent class constructor.
        super(x);// This calls the parameterized constructor of Phone with value 10.
        System.out.println(x);
        System.out.println(y);
    }

    SmartPhone(int a) {
        this.a = a;
        System.out.println(a);
    }

    void display() {
        System.out.println("Parent a variable value is- " + super.a);
        System.out.println("child a variable value is- " + a);
    }

    public void playmusic() {
        System.out.println("playing music...");
    }

    public void takePhoto() {
        System.out.println("taking photo...");
    }
}

class foldablePhone extends SmartPhone {
    foldablePhone() {
        // Implicitly calls super()
        System.out.println("This is foldablePhone - Default constuctor");
    }

    foldablePhone(int x, int y, int z) {
        super(x, y);
        System.out.println(z);
    }

    foldablePhone(int a, int b) {
        super(a);
        System.out.println(b);
    }

    public void fold() {
        System.out.println("you can fold the phone");
    }

    public void unfold() {
        System.out.println("you can un-fold the phone");
    }

}

public class revision4 {
    public static void main(String[] args) {
        foldablePhone f1 = new foldablePhone();
        // constructor of parent class first executed then child class so o/p is-
        // This is Phone - Default constructor
        // This is SmartPhone - Default constructor
        // This is foldablePhone - Default constuctor

        SmartPhone s1 = new SmartPhone(10, 20);
        s1.display();

        foldablePhone f2 = new foldablePhone(6, 7, 8);

        foldablePhone f3 = new foldablePhone(1, 2);
    }
}