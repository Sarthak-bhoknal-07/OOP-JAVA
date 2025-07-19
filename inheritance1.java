// Basic- Simple Inheritance

import java.nio.channels.Pipe.SourceChannel;

class base { // base/parent class
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class derived extends base { // derived/child class
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        derived dObj = new derived();
        // Using getX & setX from base class (inherited by derived class)
        dObj.setX(4);
        System.out.println(dObj.getX());
        // Using methods defined in derived class
        dObj.setY(5);
        System.out.println(dObj.getY());
    }
}
