/*
 * ==========================================================
 *  Machine Problem 2 - Basic Programming Exercise
 * ==========================================================
 * Item 2 -  Fibonacci Sequence with Sum
 * Instruction:
 * Create a program that generates the first n terms of the
 * Fibonacci sequence and also displays the sum of all generated
 * terms. For example, if n = 8, display both the sequence and
 * the total sum.
 * ==========================================================
 */

import java.util.Scanner; // Import Scanner class for user input

public class Item2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input
        
        // Prompt user for number of Fibonacci terms
        System.out.print("Enter how many Fibonacci terms to generate: ");
        int fibonacciTerms = scanner.nextInt(); // Read the number of terms from user
        
        if (fibonacciTerms <= 0) { // Check if input is invalid (zero or negative integer)
            System.out.println("Invalid! Please enter a positive number.");
            scanner.close(); // Close Scanner
            return; // Exit the program
        }
        
        long previousTerm = 0, lastTerm = 1; // Initialize first two Fibonacci numbers
        long sumFibonacci = 0; // Initialize sum to accumulate all terms
        
        System.out.println("\nFibonacci Sequence:"); // Display header
        
        for (int i = 1; i <= fibonacciTerms; i++) { // Loop n times to generate n terms
            System.out.print(previousTerm + " "); // Display current fibonacci term
            sumFibonacci += previousTerm; // Add current term to running sum
            
            long nextTerm = previousTerm + lastTerm; // Calculate next Fibonacci number
            previousTerm = lastTerm; // Move second to first position
            lastTerm = nextTerm; // Move next to second position
        }
        
        // Display the sum of all generated terms
        System.out.println("\n\nSum of all terms: " + sumFibonacci);
        
        scanner.close(); // Close Scanner to free resources
    }
}