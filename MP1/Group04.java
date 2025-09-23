/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 04
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

public class Group04 {
  public static void main(String[] args) {
    //Initialization of variables
    int intGrade = 90; //Hardcoded grade variable
    char charGradeLetter = ' ';

    //Converting grade to letter
    if(intGrade >= 90 && intGrade <= 100) {
      charGradeLetter ='A';
    } else if(intGrade >= 80 && intGrade <= 89) {
      charGradeLetter ='B';
    } else if(intGrade >= 70 && intGrade <= 79) {
      charGradeLetter ='C';
    } else if(intGrade >= 60 && intGrade <= 69) {
      charGradeLetter ='D';
    } else {
      charGradeLetter = 'F';
    }
    // Print to terminal
    if (charGradeLetter == 'A') {
      System.out.println("Grade: " + intGrade);
      System.out.println("Grade: " + charGradeLetter);
      System.out.println("Remark: Excellent");
    } else if (charGradeLetter == 'B') {
      System.out.println("Grade: " + intGrade);
      System.out.println("Grade: " + charGradeLetter);
      System.out.println("Remark: Good");
    } else if (charGradeLetter == 'C') {
      System.out.println("Grade: " + intGrade);
      System.out.println("Grade: " + charGradeLetter);
      System.out.println("Remark: Passed");
    } else if (charGradeLetter == 'D') {
      System.out.println("Grade: " + intGrade);
      System.out.println("Grade: " + charGradeLetter);
      System.out.println("Remark: Needs improvement");
    } else {
      System.out.println("Grade: " + intGrade);
      System.out.println("Grade: " + charGradeLetter);
      System.out.println("Remark: Failed");
    }
  }
}
