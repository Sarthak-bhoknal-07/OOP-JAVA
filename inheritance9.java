// practice question-1

class circle {
    public int radius;

    circle() {
        System.out.println("this is default constructor of circle (Base class)");
    }

    circle(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder() {
        System.out.println("This is default constructor of cylinder (derived class)");
    }

    cylinder(int r) {
        super(r);
        height = 20;
    }

    cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class inheritance9 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(10);
        // c1.radius = 10;
        System.out.println(c1.area());
        // c1.height = 20;
        System.out.println(c1.volume());

        cylinder c2 = new cylinder(10, 20);
        System.out.println(c2.area());
        System.out.println(c2.volume());

        cylinder c3 = new cylinder();// o/p-> base class and then derived claas constructor will execute
    }
}
