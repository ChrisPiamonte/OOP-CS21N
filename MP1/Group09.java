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
        int sumOfDivisors = 0; // integer variable to store the sum of divisors.
        int MAXIMUM_NUMBER = 500; // integer variable for upper bound range in checking for perfect numbers.

        System.out.println("The following are perfect numbers ranging from 1 to " + MAXIMUM_NUMBER + ":"); // Display output statement

        /*
         * Loop through all numbers from 1 to MAXIMUM_NUMBER
         * to check which ones are perfect numbers.
         */
        for (int currentNumber = 1; currentNumber <= MAXIMUM_NUMBER; currentNumber++)
        {
            sumOfDivisors = 0; // Reset divisor sum for each iteration

            /*
             * Check all possible divisors of the current number.
             * Check only up to currentNumber / 2
             * since no divisor (other than the number itself)
             * can be larger than half of the number.
             */
            for (int possibleDivisor = 1; possibleDivisor <= (currentNumber / 2); possibleDivisor++)
            {
                // If possibleDivisor divides currentNumber evenly, add it to the sum.
                if (currentNumber % possibleDivisor == 0)
                {
                     sumOfDivisors += possibleDivisor;
                }
            }
            // If the sum of divisors equals the current number, the current number is a perfect number.
            if (sumOfDivisors == currentNumber)
            {
                System.out.println(currentNumber); // Print the current number.
            }
        }   
    }
}