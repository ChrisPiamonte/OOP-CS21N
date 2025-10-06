/*
Create a program that asks the user for several numbers and computes their Least Common
Multiple (LCM).
*/

import java.util.Scanner;

public class Item9 {
    // Method to compute the Greatest Common Divisor (GCD) using Euclid's algorithm
    public static int computeGCD(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int placeholder = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = placeholder;
        }
        return firstNumber;
    }

    // Method to compute the Least Common Multiple (LCM) of two numbers
    public static int computeLCM(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
        return 0;
        }
        return (firstNumber * secondNumber) / computeGCD(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Ask how many numbers the user will enter
        System.out.print("Enter how many numbers: ");
        int totalNumbers = scanner.nextInt();

        // Store the numbers in an array
        int[] numbers = new int[totalNumbers];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < totalNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Compute the LCM step by step
        int resultLCM = numbers[0];
        for (int i = 1; i < totalNumbers; i++) {
            resultLCM = computeLCM(resultLCM, numbers[i]);
        }

        // Display the final LCM
        System.out.println("LCM of the given numbers is: " + resultLCM);

        scanner.close(); // Close scanner to avoid resource leak
    }
}
