// Handling specific exceptions

import java.util.Scanner;

public class exceptionH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[3];
        numArray[0] = 100;
        numArray[1] = 150;
        numArray[2] = 200;

        System.out.println("Enter the index of number: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number to divide the index value: ");
        int number = sc.nextInt();

        try {
            System.out.println("Index value is : " + numArray[ind]);
            System.out.println("Answer of division of index-value / number : " + numArray[ind] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound exception occured");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception occured");
        } catch (Exception e) {
            System.out.println("Some other exception occured");
            System.out.println(e);
        }
    }
}
