// Exception class in java
// create our custom exceptions using exception class

import java.util.Scanner;

class AgeException extends Exception {
    public String toString() {
        return "Age is Invalid";
    }

    public String getMessage() {
        return "Make sure that the value of age is correct";
    }
}

public class exceptionH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 0 || age > 100) {
                throw new AgeException();
            } else {
                System.out.println("Ok.. Age is valid");
            }
        } catch (AgeException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}