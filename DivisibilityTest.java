// Import Scanner to get input from user
import java.util.Scanner;

public class DivisibilityTest {
    // Main method - entry point
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to input an integer number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Loop through numbers 1 to 9 and check divisibility
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            } else {
                System.out.println(number + " is not divisible by " + i);
            }
        }

        // Close the Scanner
        input.close();
    }
}
