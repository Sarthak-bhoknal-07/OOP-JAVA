// Inheritance
// Encapsulation (private variable x with getter/setter)
// Multilevel inheritance (Phone → SmartPhone → foldablePhone)
// Private variables of a parent are not directly inherited, but their getter/setter methods are.

class Phone {
    // x is private, so it cannot be accessed directly from child classes or main

    private int x = 0;

    public void setx(int x) {
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public void receiveCall() {
        System.out.println("recieving call...");
    }

    public void cutCall() {
        System.out.println("cut the call...");
    }
}

class SmartPhone extends Phone {
    public void playmusic() {
        System.out.println("playing music...");
    }

    public void takePhoto() {
        System.out.println("taking photo...");
    }

    public void takeSelfie() {
        System.out.println("taking selfie...");
    }
}

class foldablePhone extends SmartPhone {
    public void fold() {
        System.out.println("you can fold the phone");
    }

    public void unfold() {
        System.out.println("you can un-fold the phone");
    }

}

public class revision3 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.receiveCall();
        s1.cutCall();
        s1.playmusic();
        s1.takePhoto();
        s1.setx(10);
        System.out.println(s1.getx());

        foldablePhone f1 = new foldablePhone();
        f1.receiveCall();
        f1.cutCall();
        f1.playmusic();
        f1.fold();
        f1.unfold();
        f1.setx(20);
        System.out.println(f1.getx());
    }
}
