/*
 * ==========================================================
 *  Machine Problem 2 - Basic Programming Exercise
 * ==========================================================
 * Item 1 -  Factorial of Multiple Numbers
 * Instruction:
 * Write a program that asks user for several numbers (using an
 * array) and calculates the factorial of each number using a
 * loop. Display the results for all inputs.
 * ==========================================================
 */

// Import Scanner class for user input
import java.util.Scanner; 

public class Item1 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in); 
        
        // Prompt user for how many numbers to calculate
        System.out.print("How many numbers do you want to calculate factorial for? ");
        int inputSize = scanner.nextInt();

        // Create array to store the size based on inputSize
        int[] userArray = new int[inputSize];
        
        // Display instruction to enter numbers
        System.out.println("Enter " + inputSize + " numbers:");
        for (int i = 0; i < inputSize; i++) { // Loop through array indices
            userArray[i] = scanner.nextInt(); // Store each input number in array
        }
        
        // Display header for results
        System.out.println("\nFactorial Results:");

        for (int i = 0; i < inputSize; i++) { // Loop through each number in array
            long factorialResult = 1; // Initialize factorial result to 1
            
            if (userArray[i] < 0) { // Check if current number is negative
                System.out.println(userArray[i] + "! = Undefined (negative integer)"); // Display message that factorial is undefined for negative integers
            } else { // If current number is non-negative
                
                // Calculate factorial by multiplying 1 * 2 * 3 * ... * num
                for (int j = 1; j <= userArray[i]; j++) { // Loop from 1 to num
                    factorialResult *= j; // Multiply factorial by current j value
                }
                // Display result
                System.out.println(userArray[i] + "! = " + factorialResult); 
            }
        }
        
        scanner.close(); // Close Scanner to free resources
    }
}