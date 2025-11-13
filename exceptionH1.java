class divide {
    int a;
    int b;

    divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void div() {
        // without using try-catch -Exception in thread "main"
        // java.lang.ArithmeticException
        // return a / b;

        // with using exception handling
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Fail to execute : the exception is " + e);
        }
    }
}

public class exceptionH1 {
    public static void main(String[] args) {
        divide d1 = new divide(10, 0);
        d1.div();
    }
}