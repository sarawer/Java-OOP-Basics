package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Division block
        try {
            System.out.print("Enter the value of X: ");
            int x = input.nextInt();
            System.out.print("Enter the value of Y: ");
            int y = input.nextInt();
            int result = x / y;
            System.out.println("Result of x / y: " + result);
        } catch (ArithmeticException e1) {
            System.out.println("Math error! Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some other error during division: " + e.getMessage());
        }

        // Array access block
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.print("Enter any index to see the value from array: ");
            int index = input.nextInt();
            System.out.println("The value at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Array index error! Index is out of range.");
        } catch (Exception e) {
            System.out.println("Some other error during array access: " + e.getMessage());
        } finally {
            System.out.println("Execution completed. Thank you!");
        }
    }
}
