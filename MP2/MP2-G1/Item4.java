import java.util.Scanner;

public class Item4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Input the starting number: ");
        int startNumber = scanner.nextInt();

        // Ask the user for the ending number
        System.out.print("Input the ending number: ");
        int endNumber = scanner.nextInt();

        System.out.println("Armstrong numbers between " + startNumber + " and " + endNumber + " are:");

        // Loop through all numbers in the given range
        for (int number = startNumber; number <= endNumber; number++) {
            // Check and print if the number is an Armstrong number
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }

        scanner.close(); // Close the scanner
    }

    /* * Checks if a number is an Armstrong number.
       * An Armstrong number is a number that is equal to the sum of its own digits
       * each raised to the power of the number of digits. */
    public static boolean isArmstrong(int number) {
        int originalNumber = number; // Keep a copy of the original number
        int sum = 0; // To store the sum of digits raised to the power
        int numberOfDigits = String.valueOf(number).length(); // Count digits

        // Extract each digit and compute the power
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits); // Add digit raised to power
            number /= 10; // Remove the last digit
        }

        // If sum equals original number, it is an Armstrong number
        return sum == originalNumber;
    }
}
