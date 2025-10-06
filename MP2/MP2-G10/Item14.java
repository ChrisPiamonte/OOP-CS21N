/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 14 -  Second Largest and Second Smallest Number
 * 
 *  Instruction:
 *  Write a program that finds both the second largest and
 *  second smallest numbers in an array of integers provided
 *  by the user.
 *  ==========================================================
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Item14 {
    public static void main(String[] args) throws IOException {

        // Create a BufferedReader
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        // Ask for array size
        int arraySize = 0;
        while (arraySize <= 1) {
            System.out.print("| Array Size: ");
            arraySize = Integer.parseInt(buffReader.readLine());
            if (arraySize <= 1) {
                System.out.println("| Error! Please enter a valid array size.");
            }
        }

        // Initialize array to store user inputs
        int userArray[] = new int[arraySize];

        // Ask the user for the array contents
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| Input Value #" + (i + 1) + ": ");
            userArray[i] = Integer.parseInt(buffReader.readLine());
        }

        // Identify the second smallest number by using sort
        Arrays.sort(userArray);

        // Acquire the second to the last values of both ends of the array
        int arraySecondSmallest = userArray[1];
        int arraySecondLargest = userArray[arraySize - 2];

        // Display the sorted array
        System.out.print("| Sorted Array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(userArray[i] + " ");
        }

        // Display the results
        System.out.println("\n|------------------------------------\n| Second Largest Value: " + arraySecondLargest);
        System.out.println("| Second Smallest Value: " + arraySecondSmallest);
    }
}

