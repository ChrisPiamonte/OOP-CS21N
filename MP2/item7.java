/*
Ask the user to enter a number, display its reverse, and check if the reversed number is the same
as the original (palindrome check included).
*/

import java.util.Scanner;

public class item7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Save the original number (for later comparison)
        int original = number;

        // Variable to hold the reversed number
        int reversed = 0;

        // Reverse the number digit by digit
        while (number != 0) {
            int digit = number % 10;          // extract the last digit
            reversed = reversed * 10 + digit; // shift left and add the digit
            number /= 10;                     // remove the last digit
        }

        // Show the reversed number
        System.out.println("Reversed number: " + reversed);

        // Check if the original and reversed are the same
        if (original == reversed) {
            System.out.println("The number is a palindrome!");
        } else {
            System.out.println("The number is NOT a palindrome.");
        }

        scanner.close(); // close scanner to avoid resource leak
    }
}