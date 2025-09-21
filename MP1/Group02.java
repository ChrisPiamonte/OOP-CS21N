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
    int number = 5625;
    int sumOfDigits = 0;
    int productOfDigits = 1;
    int digitDivider = 10;

    while (number != 0) {
      sumOfDigits += number % digitDivider;
      productOfDigits *= number % digitDivider;
      number /= digitDivider;
    }

    System.out.println("The sum of the digits of 5256 is " + sumOfDigits);
    System.out.println("The product of the digits of 5256 is " + productOfDigits);
  }
}
