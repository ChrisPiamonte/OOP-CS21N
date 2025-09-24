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
    public static void main(String[] args) {
        // ---------- First Part: Check if a hardcoded year is a Leap Year ----------
        
        int intYear = 2000; // The year we want to check

        /* Leap year rule:
        - Divisible by 400  -> Leap Year
        - Divisible by 4 but NOT by 100 -> Leap Year
        - Otherwise -> Not a Leap Year */
        if ((intYear % 400 == 0) || (intYear % 4 == 0 && intYear % 100 != 0)) {
            System.out.println(intYear + " is a Leap Year.");
        } else {
            System.out.println(intYear + " is NOT a Leap Year.");
        }
        System.out.println(); // Blank line for clarity

        // ---------- Challenge: List all Leap Years between 1900 and 2100 ----------
        
        System.out.println("Leap years between 1900 and 2100:");

        // Loop through each year in the range 1900–2100
        for (int intMinyear = 1900; intMinyear <= 2100; intMinyear++) {
            // Apply the same leap year rule
            if ((intMinyear % 400 == 0) || (intMinyear % 4 == 0 && intMinyear % 100 != 0)) {
                System.out.println("| "+intMinyear + " |"); // Print the leap year
            }
        }
    }
}

