//Multiple Inheritance in Java using interfaces

// A regular class with two concrete methods.
class basicCellPhone {
    public void takeCall() {
        System.out.println("Green btn-for take call");
    }

    public void cutCall() {
        System.out.println("Red btn-for cut the call");
    }
}

// Interfaces only define method signatures (no method body).
interface gps {
    void Givelocation();
}

interface camara {
    void takePics();
}

interface mediaPlayer {
    void playMediaContent();
}

// 👉 You can only extend only one class, but you can implement many interfaces.
class smartPhone extends basicCellPhone implements gps, camara, mediaPlayer {
    public void Givelocation() {
        System.out.println("Giving all about location");
    }

    public void takePics() {
        System.out.println("Taking photos / selfie");
    }

    public void playMediaContent() {
        System.out.println("Playing videos/mp3 content");
    }
}

public class interface5 {
    public static void main(String[] args) {
        smartPhone s1 = new smartPhone();
        s1.Givelocation();
        s1.takePics();
        s1.playMediaContent();
        s1.takeCall();
        s1.cutCall();

        System.out.println();

        basicCellPhone b1 = new smartPhone();
        b1.takeCall();
        b1.cutCall();
        // b1.Givelocation();// ERROR NOT ALLOWED
        // b1.takePics();// ERROR NOT ALLOWED
        // b1.playMediaContent();// ERROR NOT ALLOWED
        // ❌ Problem:
        // The object b1 is of type basicCellPhone, so it only has access to methods
        // defined in basicCellPhone class, even though it's actually a smartPhone.
        // The compiler checks the reference type, not the object type, for what methods
        // are available.
    }
}
