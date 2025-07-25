// Interface with Constant Variables

interface constants {
    // interface Variables are public static final by default (you can’t
    // change/modify)
    float pi = 3.14f; // ✅ implicitly public static final

    float area(); // ✅ implicitly public abstract
}

class circle implements constants {
    float radius;

    // Java does not allow overriding of variables, only methods can be overridden.
    // So the pi in circle is a new variable that hides the pi from the interface.
    float pi = 3.1428f; // instance variable

    public float area() {
        float a = pi * radius * radius; // The variable pi refers to the instance variable pi = 3f, not the interface
                                        // constant.
        return a;
    }
}

public class interface4 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 7f;
        System.out.println(c1.area());
    }
}

// Why? It use instance variable i.e pi=3.1428f?
// Because:
// Inside the class circle, when you write just pi, Java looks for a variable
// with that name in the current class first (instance scope).
// Since circle already defines its own pi variable, that one is used.
// The interface constant pi = 3.14f is hidden (but not removed — you can still
// access it explicitly using constants.pi).