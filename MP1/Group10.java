/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 10
 * ==========================================================
 *
 * Instructions:
 * - This file is your workspace for solving Machine Problem 1.
 * - You will practice the Programming Core Concepts discussed in class,
 *   such as variables, data types, operators, and basic string operations.
 * - Do NOT create additional classes or advanced features (like arrays)
 *   unless instructed.
 * ==========================================================
 */

public class Group10 {
  public static void main(String[] args) {
    // Initialize variables
    int n = 10;      // Number of terms in the fibonacci sequence
    int intFirstNumber = 0;     // First number in the sequence
    int intSecondNumber = 1;    // Second number in the sequence
    int intPlaceholder = 0;     // Placeholder for the next value in the sequence
    int intSum = 0;     // Variable for the sum of all values
        
    // Use loop to print and add values
    for (int i = 0; i < n; i++) {
      System.out.print(intFirstNumber + " ");     // Print each values in the sequence
      intPlaceholder = intFirstNumber + intSecondNumber;      // Add the initial 2 values and assign it to the placeholder 
      intFirstNumber = intSecondNumber;       // Assign the second number to the first number
      intSecondNumber = intPlaceholder;       // Assign the value in our placceholder to our intSecondNumber
      intSum += intFirstNumber;       // Add all the values
    }
    System.out.println("\nSum of all values: " + intSum);   // Print the sum of all values
  }
}
