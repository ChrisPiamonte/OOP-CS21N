/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 12 -  Sum of Even and Odd Numbers with Difference
 * 
 *  Instruction:
 *  Write a program that accepts a range of numbers, computes
 *  separately the sum of even numbers and odd numbers, and
 *  also finds the difference between the two sums.
 *  ==========================================================
*/

import java.util.Scanner;

public class Item12 {
    
    // Method to find the sum of even numbers
    public static int sumOfEven (int arraySize, int[] storageArray) {
        int sumEven = 0;

        // Check each number in the array to determine if it is even using modulo division
        for (int i = 0; i < arraySize; i++) {
            if (storageArray[i] % 2 == 0) {
                sumEven += storageArray[i];
            }
        }
        return sumEven;
    }

    // Method to find the sum of odd numbers
    public static int sumOfOdd (int arraySize, int[] storageArray) {
        int sumOdd = 0;

        // Check each number in the array to determine if it is odd using modulo division
        for (int i = 0; i < arraySize; i++) {
            if (storageArray[i] % 2 == 1) {
                sumOdd += storageArray[i];
            }
        }
        return sumOdd;
    }

    public static void main (String[]args) {

        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask how many numbers the user wants to enter
        System.out.print("How many numbers do you want to enter: ");
        int arraySize = scanner.nextInt();

        int[] storageArray = new int[arraySize];      // initialize the array

        // Input the numbers
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            storageArray[i] = scanner.nextInt();
        }

        // Compute the sums and the difference
        int sumOfEvenNumbers = sumOfEven(arraySize, storageArray);
        int sumOfOddNumbers = sumOfOdd(arraySize, storageArray);
        int differenceOfSums = sumOfEvenNumbers - sumOfOddNumbers;

        // Display the results
        System.out.println("--------------------------");
        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
        System.out.println("Sum of Odd Numbers: " + sumOfOddNumbers);
        System.out.println("Difference of Sums: " + differenceOfSums);

        scanner.close();
    }
}