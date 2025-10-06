/*
Ask the user to enter a number, display its reverse, and check if the reversed number is the same
as the original (palindrome check included).
*/

import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Save the original number (for later comparison)
        int originalNumber = userInput;

        // Variable to hold the reversed number
        int reversedNumber = 0;

        // Reverse the number digit by digit
        while (userInput != 0) {
            int lastDigit = userInput % 10;          // extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // shift left and add the digit
            userInput /= 10;                     // remove the last digit
        }

        // Show the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Check if the original and reversed are the same
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome!");
        } else {
            System.out.println("The number is NOT a palindrome.");
        }

        scanner.close(); // close scanner to avoid resource leak
    }
}