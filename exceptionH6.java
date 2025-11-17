// Throw

class NegativeAreaException extends Exception {
    public String toString() {
        return "Negation value for area is NOT ALLOWED";
    }
}

public class exceptionH6 {
    public static float AreaOfCircle(float r) throws NegativeAreaException {
        if (r < 0) {
            throw new NegativeAreaException();
        }
        float area = (float) (2 * Math.PI * r * r);
        return area;
    }

    public static void main(String[] args) {
        try {
            float area = AreaOfCircle(-5);
            System.out.println("area of circle (r=5) = " + area);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
