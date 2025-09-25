/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 05
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

public class Group05 {
  public static void main(String[] args) {

    //intNumber is the hardcoded number to find multiples of
    //Change this value to test with other numbers
        int intNumber = 10, intSumMultiples = 0;
        //loop to print the multiples of intNumber from 1 to 100
        for (int intIndex = intNumber; intIndex <= 100; intIndex += intNumber) {

            System.out.print(intIndex + " ");
            intSumMultiples += intIndex;
        }
        //print the sum of the multiples
        System.out.println("\nSum of multiples: " + intSumMultiples);
    }
}