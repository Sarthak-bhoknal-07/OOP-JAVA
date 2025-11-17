// finally block - finally is a block in Java that always executes, whether an exception occurs or not.

public class exceptionH7 {
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("So this is the output");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = divide(10, 0);
        System.out.println(k);
    }
}
