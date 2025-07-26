class monkey {
    public void jump() {
        System.out.println("Monkey jumps");
    }

    public void bite() {
        System.out.println("Monkey bites");
    }
}

interface basicAnimal {
    void eat();

    void sleep();
}

class human extends monkey implements basicAnimal {
    public void eat() {
        System.out.println("human eats");
    }

    public void sleep() {
        System.out.println("human sleeps");
    }

    public void jump() {
        System.out.println("human jumps");
    }
}

public class practiceQ2 {
    public static void main(String[] args) {
        human h1 = new human();
        h1.eat();
        h1.sleep();
        h1.jump(); // overridden method in human
        h1.bite(); // not overridden, so monkey's bite() runs

        monkey m1 = new human(); // Parent reference, Child object
        m1.jump(); // calls human's jump() -> overridden (runtime polymorphism)
        m1.bite(); // calls monkey's bite()
    }
}
