/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 02
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

public class Group02 {
  public static void main(String[] args) {
    // Initialization of variables
    int intNumber = 5625;
    int intSumOfDigits = 0;
    int intProductOfDigits = 1;
    int intDigitDivider = 10;

    // Loop for computing the sum and product of each digits of intNumber
    while (intNumber != 0) {
      intSumOfDigits += intNumber % intDigitDivider;         // Obtain the sum of the digits of intNumber
      intProductOfDigits *= intNumber % intDigitDivider;     // Obtain the product of the digits of intNumber
      intNumber /= intDigitDivider;                          // Removes the last digit of intNumber
    }

    // Printing of outputs 
    System.out.println("The sum of the digits of 5625 is " + intSumOfDigits);
    System.out.println("The product of the digits of 5625 is " + intProductOfDigits);
  }
}
