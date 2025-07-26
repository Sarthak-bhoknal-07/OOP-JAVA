// Abstraction + Interface + Polymorphism (DMD) 

import java.nio.channels.Pipe.SourceChannel;

abstract class basicCellPhone {
    abstract void takeCall();

    abstract void cutCall();

    public void basicSnakeGame() {
        System.out.println("Basic Snake game in cellPhone");
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

class smartPhone extends basicCellPhone implements gps, camara, mediaPlayer {
    public void takeCall() {
        System.out.println("Swipe Up - to take the call");
    }

    public void cutCall() {
        System.out.println("Swipe Down - to cut the call");
    }

    public void Givelocation() {
        System.out.println("Giving all about location");
    }

    public void takePics() {
        System.out.println("Taking photos / selfie");
    }

    public void playMediaContent() {
        System.out.println("Playing videos/mp3 content");
    }

    public void pubgGame() {
        System.out.println("High graphics PUBG Game in smartphone");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // this is smartPhone but use as a gps
        gps g1 = new smartPhone(); // Can only use GPS method
        g1.Givelocation();
        // g1.takePics();// ERROR

        // c1 is the reference type of camara, it can only use camara methods, even
        // though the object is smartPhone
        camara c1 = new smartPhone();
        c1.takePics();

        basicCellPhone b1 = new smartPhone();
        b1.takeCall();
        b1.basicSnakeGame();
    }
}

// 1 Dynamic method dispatch (runtime polymorphism):
// Method execution depends on object type (smartPhone) not reference type.

// 2 Reference type restricts access:
// Reference decides which methods you can call.

// 3 Interfaces allow multiple inheritance:
// smartPhone implements multiple interfaces.

// The reference type - decides which methods you can access.
// The object type - decides which method implementation runs at runtime.
