// Basic OOP question-2

import java.util.*;

class square {
    int side;

    public void getArea() {
        System.out.println(side * side);
    }

    public void getParimeter() {
        System.out.println(4 * side);
    }
}

public class class3 {
    public static void main(String[] args) {
        square sq1 = new square();
        sq1.side = 3;
        sq1.getArea();
        sq1.getParimeter();
    }
}
