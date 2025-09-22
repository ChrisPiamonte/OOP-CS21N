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

    // Print the first n Fibonacci numbers 
    int n = 10;

    // Initialize the first two addends to generate the Fibonacci sequence
      // Sequence initialization (these variables will represent the two numbers that forms the succeeding values)
    int firstAddend = 0, secondAddend = 1;

    // The second addend is the current highest value at this point in program time
    int succeedingValue = secondAddend;
    int summationValue = succeedingValue; // Initialize the variable for the sum of all the numbers in the sequence

    // For loop was chosen since it already integrates a counter (i) which is necessary for the sequence's limit
    for (int i = 0; i < n; i++) {
      // Print the first two values in the Fibonacci sequence
      System.out.print(firstAddend + ", "); // Formatting purposes

      // The succeeding value in the sequence can be acquired by adding the two numbers before it
      succeedingValue = firstAddend + secondAddend;

      // Update the values of the two numbers
      firstAddend = secondAddend;
      secondAddend = succeedingValue;

      // Add the current values together
      summationValue = summationValue + succeedingValue;
    }

    // Print the sum of all the numbers in the Fibonacci Sequence once the loop ends
    System.out.print("\nSummation: " + summationValue + "\n\n");
  }
}
