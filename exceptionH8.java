// finally block - finally is a block in Java that always executes, whether an exception occurs or not.

public class exceptionH8 {
    public static void divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("So this is the output");
        }
    }

    public static void main(String[] args) {
        // ex. 1
        divide(10, 0);

        System.out.println();

        // ex. 2
        int a = 50;
        int b = 5;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("Finally block - Always Runs b = " + b);
            }
            b--;
        }

        System.out.println();

        // ex. 3 - can use try and finally without catch(handling)
        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("Yes this is finally");
        }
        // Exception can occurs in above code 
    }
}
