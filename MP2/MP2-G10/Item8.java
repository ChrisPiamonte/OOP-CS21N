import java.util.Scanner;

public class Item8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask how many numbers the user wants to input
        System.out.print("Enter how many numbers: ");
        int numberCount = scanner.nextInt();

        int[] numbers = new int[numberCount]; // array to store all input numbers

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numberCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        // assume the first number as the initial greatest common divisor
        int greatestCommonDivisor = numbers[0];

        // find the greatest common divisor of all numbers in the array
        for (int i = 1; i < numberCount; i++) {
            greatestCommonDivisor = findGreatestCommonDivisor(greatestCommonDivisor, numbers[i]);
        }

        // display the final result
        System.out.println("The Greatest Common Divisor of all numbers is: " + greatestCommonDivisor);

        scanner.close(); // close the scanner
    }

    // method to find the greatest common divisor of two numbers using Euclidean Algorithm
    public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temporaryNumber = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temporaryNumber;
        }
        return firstNumber;
    }
}
