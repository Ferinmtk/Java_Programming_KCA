public class MultiplesInRange {
    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Define the range: starting from 71 to 150
        int start = 71;
        int end = 150;

        // Display message for multiples of 2
        System.out.println("Multiples of 2 between " + start + " and " + end + ":");
        // Loop through the range and check for multiples of 2
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // If the number is divisible by 2
                System.out.println(i); // Print the multiple
            }
        }

        // Display message for multiples of 3
        System.out.println("\nMultiples of 3 between " + start + " and " + end + ":");
        // Loop through the range and check for multiples of 3
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) { // If the number is divisible by 3
                System.out.println(i); // Print the multiple
            }
        }

        // Display message for multiples of 7
        System.out.println("\nMultiples of 7 between " + start + " and " + end + ":");
        // Loop through the range and check for multiples of 7
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) { // If the number is divisible by 7
                System.out.println(i); // Print the multiple
            }
        }
    }
}
