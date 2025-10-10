import java.util.Scanner;

public class Item8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to input
        System.out.print("How many numbers do you want to input? ");
        int numberCount = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[numberCount];

        // Get all numbers from the user
        for (int i = 0; i < numberCount; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize gcd with the first number
        int gcdResult = numbers[0];

        // Compute GCD for all numbers in the array
        for (int i = 1; i < numberCount; i++) {
            gcdResult = findGcd(gcdResult, numbers[i]);
        }

        // Display the final GCD result
        System.out.println("The GCD of all the numbers is: " + gcdResult);

        scanner.close(); // Close the scanner
    }

    /* * Finds the GCD (Greatest Common Divisor) of two numbers
       * using the Euclidean algorithm. */
    public static int findGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber; // Return the GCD
    }
}
