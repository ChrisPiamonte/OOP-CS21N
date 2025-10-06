/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 10 -  Count Digits and Find Largest Digit
 * 
 *  Instruction:
 *  Write a program that counts how many digits a number has
 *  and also displays the largest digit in the number.
 *  ==========================================================
*/

import java.util.Scanner;

public class Item10 {

    // Method to count the digits of the number
    public static int counter(int userInput, int[] storage) {
        int digitCount = 0;
        while (userInput > 0) {                     
            storage[digitCount] = userInput % 10;     // store the digit in the array
            userInput /= 10;                           // remove the last digit from the number
            digitCount++;                             // increment the count
        }
        return digitCount;
    }
    
    // Method to find the largest digit of the number
    public static int largestDigit(int[] userArray, int digitCount) {
        int largestDigit = userArray[0];         // assign the first digit as largest

        // Check all digits and find the largest
        for (int i = 1; i < digitCount; i++) {      
            if (userArray[i] > largestDigit) {
                largestDigit = userArray[i];         
            }
        }
        return largestDigit;
    }

    public static void main(String[]args) {

        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Handles negative inputs
        if (userInput < 0) {
            userInput = -userInput;
        }

        // Initialize array and variables
        int[] userArray = new int[20];
        int digitCount = counter(userInput, userArray);
        int largestDigit = largestDigit(userArray, digitCount);

        // Display the output
        System.out.println("--------------------------");
        System.out.println("Number of Digits: " + digitCount);
        System.out.println("Largest Digit: " + largestDigit);

        scanner.close();
    }
}
