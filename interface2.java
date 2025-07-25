// Multiple Classes Implementing the Same Interface

interface bicycle {
    // Interfaces cannot have constructors
    // bicycle(){
    // It gives error
    // }

    void speedup(int increment);

    void applyBrake(int decrement);

    void Condition();
}

class AvonCycle implements bicycle {
    AvonCycle() {
        System.out.println("This is AvonCycle");
    }

    int speed;

    public void speedup(int increment) {
        speed = speed + increment;
        System.out.println("Speed up - " + speed);
    }

    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("Apply break - " + speed);
    }

    public void Condition() {
        System.out.println("Brand new condition");
    }
}

class SecondCycle implements bicycle {
    SecondCycle() {
        System.out.println("This is Second hand Cycle");
    }

    int speed;

    public void speedup(int incr) {
        speed = speed + incr;
        System.out.println("Speed up - " + speed);
    }

    public void applyBrake(int decr) {
        speed = speed - decr;
        System.out.println("Apply break - " + speed);
    }

    public void Condition() {
        System.out.println("Average condition");
    }
}

public class interface2 {
    public static void main(String[] args) {
        AvonCycle a1 = new AvonCycle();
        a1.speed = 80;
        a1.speedup(20);
        a1.applyBrake(40);
        a1.Condition();

        SecondCycle s1 = new SecondCycle();
        s1.speed = 60;
        s1.speedup(20);
        s1.applyBrake(30);
        s1.Condition();
    }
}
