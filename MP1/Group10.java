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
    // Number of Fibonacci terms to be printed
    int intMaxTerms = 10;      

    // Initialize the first two Fibonacci numbers: 0 and 1
    int intPreviousTerm = 0;      // Second Most Recent Term
    int intCurrentTerm = 1;       // Most Recent Term
    
    // Placeholder for the succeeding number
    int intNextTerm;

    // This keeps the running total of the numbers
    int intSum = 0;
        
    // Formatting Purposes [ This adds elements for output clarity ]
    System.out.print("\n\n\n| ");

    // Generate "intMaxTerms" Fibonacci terms
    for (int intIteration = 0; intIteration < intMaxTerms; intIteration++) {
      // Print second most recent term
      System.out.print(intPreviousTerm);

      // Formatting purposes [ This adds comma between the printed terms ]
      if (intIteration != (intMaxTerms - 1)) {
        System.out.print(", ");
      }

      // The succeeding value in the sequence can be acquired by adding the two most recent terms
      intNextTerm = intPreviousTerm + intCurrentTerm;       // Add the two most recent terms and assign the sum as the next term
      intSum += intPreviousTerm;                            // Update the sum

      intPreviousTerm = intCurrentTerm;    // Assign the former most recent term as the second most recent term
      intCurrentTerm = intNextTerm;        // Assign the value in our placeholder as the new most recent term
                    
    }
    // Print the sum of the printed Fibonacci terms + line breaks
    System.out.print("\n| Sum of all values: " + intSum + "\n\n\n\n");
  }
}
