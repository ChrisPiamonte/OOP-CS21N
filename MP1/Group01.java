/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 01
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

public class Group01 {
    public static void main(String[] args) 
    { 
        System.out.println("Leap years between 1900 and 2100:");

        for (int year = 1900; year <= 2100; year++) 
        {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
            {
                System.out.println(year);
            }
        }
    }
}