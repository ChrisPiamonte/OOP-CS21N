/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 03
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

public class Group03 {
  public static void main(String[] args) {
        int secretNumber = 42;

        int guessNum1 = 30;
        int guessNum2 = 50;
        int guessNum3 = 42;
        boolean found = false;

        if (!found) {
            if (guessNum1 == secretNumber) {
                System.out.println("Guess 1 (" + guessNum1 + "): Correct!");
                found = true;
            } else if (guessNum1 > secretNumber) {
                System.out.println("Guess 1 (" + guessNum1 + "): Too high!");
            } else {
                System.out.println("Guess 1 (" + guessNum1 + "): Too low!");
            }
        }
        
        if (!found) {
            if (guessNum2 == secretNumber) {
                System.out.println("Guess 2 (" + guessNum2 + "): Correct!");
                found = true;
            } else if (guessNum2 > secretNumber) {
                System.out.println("Guess 2 (" + guessNum2 + "): Too high!");
            } else {
                System.out.println("Guess 2 (" + guessNum2 + "): Too low!");
            }
        }
        
        if (!found) {
            if (guessNum3 == secretNumber) {
                System.out.println("Guess 3 (" + guessNum3 + "): Correct!");
                found = true;
            } else if (guessNum3 > secretNumber) {
                System.out.println("Guess 3 (" + guessNum3 + "): Too high!");
            } else {
                System.out.println("Guess 3 (" + guessNum3 + "): Too low!");
            }
        }
        
        if (!found) {
            System.out.println("No correct guess found after all attempts.");
        }
    }
}