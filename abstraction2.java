// practice ques- Abstract Class with Multiple Levels of Inheritance

abstract class shape {
    int length;
    int height;
    int width;
    int radius;

    shape() {
        System.out.println("This is shape (parent) class constructor");
        length = 10;
        height = 20;
        width = 30;
        radius = 40;
    }

    abstract int area();

    public void setlength(int l) {
        this.length = l;
    }

    public void setwidth(int w) {
        this.width = w;
    }

    public void setheight(int h) {
        this.height = h;
    }

    public void setradius(int r) {
        this.radius = r;
    }
}

abstract class TwoDshape extends shape {
    TwoDshape() {
        System.out.println("2 D shape constructor");
    }
}

abstract class ThreeDshape extends shape {
    ThreeDshape() {
        System.out.println("3 D shape constructor");
    }
}

class circle extends shape {
    public int area() {
        return (int) Math.PI * radius * radius;
    }
}

class rectangle extends shape {
    public int area() {
        return length * width;
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setlength(7);
        r.setwidth(4);
        System.out.println(r.area());

        shape s = new circle();// becoz obj is created of circle, shape s is reference
        System.out.println(s.area());

    }
}
