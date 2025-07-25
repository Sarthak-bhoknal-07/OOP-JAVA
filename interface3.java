//  Interface + Inheritance in Java using multiple interfaces

interface musicplayer {
    public void playMusic();
}

interface engine {
    public void turnOnEngine();

    public void turnOffEngine();
}

class car implements musicplayer, engine {
    public void playMusic() {
        System.out.println("Playing music..");
    }

    public void turnOnEngine() {
        System.out.println("Turning on engine..");
    }

    public void turnOffEngine() {
        System.out.println("Turning off engine..");
    }
}

public class interface3 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.playMusic();
        c1.turnOnEngine();
        c1.turnOffEngine();
    }
}
