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
    int number = 5625;
    int sumOfDigits = 0;
    int productOfDigits = 1;
    int digitDivider = 10;

    // Loop for computing the sum and product of each digits
    while (number != 0) {
      sumOfDigits += number % digitDivider;         // Obtain the sum of the digits of number
      productOfDigits *= number % digitDivider;     // Obtain the product of the digits of number
      number /= digitDivider;                       // Removes the last digit of the number
    }

    // Printing of Outputs 
    System.out.println("The sum of the digits of 5256 is " + sumOfDigits);
    System.out.println("The product of the digits of 5256 is " + productOfDigits);
  }
}
