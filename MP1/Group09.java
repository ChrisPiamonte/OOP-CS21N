/*
 * ==========================================================
 *  Machine Problem 1 - Workspace for Group 09
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

public class Group09 
{
    public static void main(String[] args) 
    {
        // Initialize variables
        int currentNumber;
        final int MAXIMUM_NUMBER = 500;
        int possibleProperDivisor;
        int properDivisorSum = 0;
       
        System.out.println("The following are the perfect numbers from 1 to 500: "); // Display output statement

        for (currentNumber = 1; currentNumber <= MAXIMUM_NUMBER; currentNumber++) // Loop through all numbers from 1 to 500
        {
            properDivisorSum = 0; // Initialize properDivisorSum to 0 for each iteration

            for (possibleProperDivisor = 1; possibleProperDivisor <= currentNumber / 2; possibleProperDivisor++) //Another loop to go through each number from 1 to half of the current number as the divisor
            {
                if (currentNumber % possibleProperDivisor == 0) // Checks if currentNumber and possibleProperDivisor divides without a remainder
                {
                    properDivisorSum += possibleProperDivisor; // If true, add it to the properDivisorSum
                }
            }

            if (properDivisorSum == currentNumber) // Checks if the properDivisorSum is equal to the currentNumber
            {
                System.out.println(currentNumber); // If true, print the currentNumber (it is a perfect number)
            }
        }

    }
}
