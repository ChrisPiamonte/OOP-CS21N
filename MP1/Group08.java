/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 08
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

public class Group08 {
  public static void main(String[] args) {
    //Declare variables of the program
      int intN = 7;
      int intSum = 0;
      int intCount = 0; 
      double dblAverage = 0; 

    //Utilize a for loop to calculate the numbers from 1 to 100 that are divisible by intN
      for(int i = 1; i <= 100; i++){
        if(i % 7 == 0){
        //Summation of multiples of numbers from 1 to 100
          intSum += i;
        //A counter for how many numbers successfuly iterated that are divisible by 7.
          intCount++;
        }
      }

    //The sum of multiple of numbers
      System.out.println("The sum of multiple " + intN + " from 1 to 100 is " + intSum + ".");

    //Checker if the numbers are divisible by intN
      if(intCount > 0){
    //Calculate the average of multiples of numbers. 
        dblAverage = (double) intSum/intCount;
        System.out.println("The Average of numbers from 1 to 100 that is divisible by " + intN + " is " + dblAverage + ".");
      } else { 
        System.out.println("Digits 1 to 100 is not divisible by " + intN + ".");
      }
  }
}