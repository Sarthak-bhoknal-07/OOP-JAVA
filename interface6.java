// example of abstraction + interface + multiple inheritance via interfaces + dynamic method dispatch

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

public class interface6 {
    public static void main(String[] args) {
        smartPhone s1 = new smartPhone();
        s1.takeCall();
        s1.cutCall();
        s1.Givelocation();
        s1.takePics();
        s1.playMediaContent();
        s1.basicSnakeGame();
        s1.pubgGame();

        System.out.println();

        basicCellPhone b1 = new smartPhone();
        b1.takeCall();
        b1.cutCall();
        b1.basicSnakeGame();
        // b1.pubgGame();// ❌ Error ( You can only call methods available in the
        // reference type (basicCellPhone), even though the object is a smartPhone )
    }
}
