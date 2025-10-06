/*
 * ==========================================================
 *  Machine Problem 2 - Basic Programming Exercise
 * ==========================================================
 * Item 3 -  Prime Number in a Range
 * Instruction:
 * Write a program that accepts two numbers as a range and
 * prints all prime numbers within that range. Also, display
 * how many prime numbers were found.
 * ==========================================================
 */

import java.util.Scanner; // Import Scanner class for user input

public class Item3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input 
        
        System.out.print("Enter the start of range: "); // Prompt for start value
        int startRange = scanner.nextInt(); // Read start of range from user
        
        System.out.print("Enter the end of range: "); // Prompt for end value
        int endRange = scanner.nextInt(); // Read end of range from user
        
        if (startRange > endRange) { // Check if start is greater than end
            System.out.println("Invalid range! Start should be less than or equal to end.");
            scanner.close(); // Close Scanner
            return; // Exit the program
        }
        
        // Display header with the range
        System.out.println("\nPrime numbers between " + startRange + " and " + endRange + ":");
        
        int count = 0; // Initialize counter for prime numbers found
        
        // Check every number in the range
        for (int i = startRange; i <= endRange; i++) { // Loop through each number in range
            if (isPrime(i)) {               // Check if current number is prime
                System.out.print(i + " ");  // Display all prime number
                count++;                    // Increment prime counter
            }
        }
        
        // Display how many primes were found
        System.out.println("\n\nTotal prime numbers found: " + count);
        
        // Close Scanner to free resources
        scanner.close(); 
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int checkNumber) {
        if (checkNumber <= 1) { // Numbers 1 and below are not prime
            return false; // Return false for non-prime
        }
        if (checkNumber == 2) { // 2 is the only even prime number
            return true; // Return true for 2
        }
        if (checkNumber % 2 == 0) { // Check if number is even
            return false; // Even numbers (Except 2) are not prime
        }
        
        for (int i = 3; i * i <= checkNumber; i += 2) { // Loop through odd numbers up to  sqrt(n)
            if (checkNumber % i == 0) { // Check if n is divisible by i
                return false; // If divisible, not prime
            }
        }
        
        return true; // If no divisors found, n is prime
    }
}