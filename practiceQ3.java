// Polymorphism

import java.net.SocketTimeoutException;

abstract class telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class smartPhone extends telephone {
    void ring() {
        System.out.println("ringing smartphone");
    }

    void lift() {
        System.out.println("lifting smartphone");
    }

    void disconnect() {
        System.out.println("disconnecting smartphone");
    }
}

public class practiceQ3 {
    public static void main(String[] args) {
        telephone t1 = new smartPhone();
        t1.ring();
        t1.lift();
        t1.disconnect();
    }
}
