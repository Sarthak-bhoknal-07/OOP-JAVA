// Basic OOP question-3 Area and perimeter of rectangle and circle
class circle {
    int radius;

    public void areaOfCircle() {
        System.out.println("Area of circle = " + 3.14 * radius * radius);
    }

    public void parimeterOfCircle() {
        System.out.println("Perimeter of circle = " + 2 * 3.14 * radius);
    }
}

class rectangle {
    float length;
    float width;

    public float area() {
        return length * width;
    }

    public float parimeter() {
        return 2 * (length + width);
    }
}

public class class4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.length = 12.5f;
        r1.width = 4.5f;

        System.out.println("Area of rectangle = " + r1.area());
        System.out.println("parimeter of rectangle = " + r1.parimeter());

        circle c1 = new circle();
        c1.radius = 4;
        c1.areaOfCircle();
        c1.parimeterOfCircle();
    }
}
