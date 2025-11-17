// 'throws' keyword

public class ExceptionH5 {
    public int divide(int a, int b) throws ArithmeticException {
        // the divide function is made by Sahil
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Sarthak - uses divide() created by sahil
        ExceptionH5 obj = new ExceptionH5();
        try {
            int c = obj.divide(6, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

// Explaination- Sahil said my divide() can throw ArithmeticException
// SO its sarthak which uses divide() have to handle this exception