package oopcat2;

import java.util.Scanner; // Import Scanner for user input

// Main class for division with exception handling
public class DivisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        try {
            // Prompt user for input
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            scanner.close(); // Close the scanner to prevent memory leaks
        }
    }
}
