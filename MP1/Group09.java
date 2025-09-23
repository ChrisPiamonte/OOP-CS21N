/**
 * Machine Problem 1
 * - Hardcode a number
 * - A number is perfect if the sum of its divisors (excluding itself) equals the number
 * 
 * Example: 28 → divisors 1, 2, 4, 7, 14 → sum = 28 → perfect number
 * Challenge: Print all perfect numbers between 1 and 500.
 */

public class Group09
{
    public static void main(String[] args)
    {
        // Initialize variables
        int currentNumber;
        int MAXIMUM_NUMBER = 500;
        int possibleProperDivisor;
        int properDivisorSum = 0;

        
        System.out.println("The following are perfect numbers ranging from 1 to 500: "); // Display output statement

        for (currentNumber = 1; currentNumber <= MAXIMUM_NUMBER; currentNumber++) // Loop through all numbers from 1 to 500
        {
            properDivisorSum = 0; // Initialize properDivisorSum to 0 for each iteration

            for (possibleProperDivisor = 1; possibleProperDivisor <= currentNumber / 2; possibleProperDivisor++) //another loop to go through each number from 1 to half of the current number as the divisor
            {
                if (currentNumber % possibleProperDivisor == 0) // checks if currentNumber and possibleProperDivisor divides without a remainder
                {
                    properDivisorSum += possibleProperDivisor; // if true, add it to the properDivisorSum 
                }
            }

            if (properDivisorSum == currentNumber) // checks if the properDivisorSum is equal to the currentNumber
            {
                System.out.println(currentNumber); // if true, print the currentNumber (it is a perfect number)
            }
        }

    }
}