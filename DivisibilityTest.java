// This program helps kids learn divisibility tests of integers.
// It checks if a given number is divisible by numbers in the range 0-9.
// For divisibility by 5, it provides a special message explaining if the number ends in 5 or 0.

import java.util.Scanner;

public class DivisibilityTest {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the kid
        Scanner scanner = new Scanner(System.in);

        // Tells the kid to enter a number
        System.out.println("Hello, Welcome to my little Divisiblity Test. My name is Scoobiedoo");
        System.out.println("Enter a number to test divisibility:");
        int number = scanner.nextInt();

        // Checks the divisibility test and loops through 1-9
        for (int i = 1; i <= 9; i++) {

            if (number % i == 0) {

                if (i == 5) {
                    // Check if the last digit of the number is 5 or 0
                    int lastDigit = number % 10;
                    if (lastDigit == 5) {
                        System.out.println(number + " is divisible by 5 because it ends with a 5.");
                    } else if (lastDigit == 0) {
                        System.out.println(number + " is divisible by 5 because it ends with a 0 (zero).");
                    }
                } else {
                    // For other numbers, it simply prints that the number is divisible by i
                    System.out.println(number + " is divisible by " + i + ".");
                }
            }
        }

        // Closes the scanner object to avoid resource leaks
        scanner.close();
    }
}
