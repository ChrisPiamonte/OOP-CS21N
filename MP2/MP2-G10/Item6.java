/*
Create a program that accepts a number and repeatedly finds the sum of its digits until the result
is a single digit. For example, 9875 → 29 → 11 → 2.
*/

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Print the starting number (Beginning of the process)
        System.out.print("Process: " + userInput);

        // Repeat the process until the number becomes a single digit
        while (userInput >= 10) {        // Condition: Number has 2 or more digits
            int sumDigits = 0;           // To hold the sum of digits
            int copyInput = userInput;   // Copy of the current number

            // Add all digits of 'copyInput'
            while (copyInput > 0) {
                sumDigits += copyInput % 10;   // Extract the last digit and add to sum
                copyInput /= 10;               // Remove the last digit
            }

            // Update 'userInput' with the computed sum of digits
            userInput = sumDigits;

            // Print the new result in the sequence
            System.out.print(" -> " + userInput);
        }

        // Once loop ends, 'userInput' is a single digit
        System.out.println("\nFinal single digit: " + userInput);

        scanner.close(); // Close scanner to avoid resource leak
    }
}
