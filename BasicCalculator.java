
// Import the Scanner class to allow user input
import java.util.Scanner;

public class BasicCalculator {
    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables to store the two numbers and the operation
        double num1, num2; // For storing the two numbers
        char operation;    // For storing the operation (+, -, *, /)
        double result; // To store the result of the operation

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble(); // Store the first number

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble(); // Store the second number

        // Prompt the user to enter the operation (+, -, *, /)
        System.out.print("Enter an operation (+, -, *, /): ");
        operation = input.next().charAt(0); // Read the first character of the user's input for the operation

        // Switch statement to determine which operation to perform
        switch (operation) {
            case '+':
                result = num1 + num2; // Perform addition
                break;
            case '-':
                result = num1 - num2; // Perform subtraction
                break;
            case '*':
                result = num1 * num2; // Perform multiplication
                break;
            case '/':
                // Check if the denominator is not zero to avoid division by zero
                if (num2 != 0) {
                    result = num1 / num2; // Perform division
                } else {
                    // If the second number is zero, print an error message and return to exit the program
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                // If the user enters an invalid operation, print an error message and return
                System.out.println("Error: Invalid operation entered.");
                return;
        }

        // Display the result of the operation to the user
        System.out.println("The result of " + num1 + " " + operation + " " + num2 + " = " + result);

        // Close the Scanner object to prevent resource leaks
        input.close();
    }
}
