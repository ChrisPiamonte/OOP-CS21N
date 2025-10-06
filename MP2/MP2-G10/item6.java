/*
Create a program that accepts a number and repeatedly finds the sum of its digits until the result
is a single digit. For example, 9875 → 29 → 11 → 2.
*/

import java.util.Scanner;

public class item6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the starting number (beginning of the process)
        System.out.print("Process: " + number);

        // Repeat the process until the number becomes a single digit
        while (number >= 10) {  // condition: number has 2 or more digits
            int sum = 0;        // to hold the sum of digits
            int temp = number;  // copy of the current number

            // Add all digits of 'temp'
            while (temp > 0) {
                sum += temp % 10;   // extract the last digit and add to sum
                temp /= 10;         // remove the last digit
            }

            // Update 'number' with the computed sum of digits
            number = sum;

            // Print the new result in the sequence
            System.out.print(", " + number);
        }

        // Once loop ends, 'number' is a single digit
        System.out.println("\nFinal single digit: " + number);

        scanner.close(); // close scanner to avoid resource leak
    }
}
