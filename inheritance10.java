import java.nio.channels.Pipe.SourceChannel;

class rectangle {
    int length;
    int width;
    int height;

    rectangle() {
        System.out.println("constructor of rectangle");
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void setwidth(int w) {
        this.width = w;
    }

    public void setheight(int h) {
        this.height = h;
    }

    public int area() {
        return this.length * this.width;
    }

    public int volume() {
        return this.length * this.width * this.height;
    }
}

class cuboid extends rectangle {
    cuboid() {
        System.out.println("constructor of cuboid");
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void setwidth(int w) {
        this.width = w;
    }

    public void setheight(int h) {
        this.height = h;
    }

    public int area() {
        return 2 * (this.length * this.width + this.width * this.height + this.length * this.height);
    }

    public int volume() {
        return this.length * this.width * this.height;
    }
}

public class inheritance10 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setLength(10);
        r.setheight(20);
        r.setwidth(30);
        System.out.println(r.area());
        System.out.println(r.volume());

        System.out.println();

        cuboid c = new cuboid();
        c.setLength(10);
        c.setheight(20);
        c.setwidth(30);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
