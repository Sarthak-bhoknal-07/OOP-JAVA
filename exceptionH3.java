// nested try-catch 

import java.util.Scanner;

public class exceptionH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the index: ");
            int ind = sc.nextInt();

            try {
                System.out.println("Outer try starts");
                System.out.println(arr[ind]);
                try {
                    System.out.println("Inner try starts");
                    System.out.println("Enter number to divide: ");
                    int number = sc.nextInt();
                    System.out.println(arr[ind] / number);
                    flag = false;
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException occured");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occured");
            }
        }
        System.out.println("Thank you for using this program");
    }
}
