/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 13 -  Array Maximum, Minimum, and Average
 * 
 *  Instruction:
 *  Ask the user to enter n numbers, store them in an array,
 *  and determine the largest number, smallest number, and the
 *  average of all numbers.
 *  ==========================================================
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item13 {
    public static void main(String[] args) throws IOException {
        
        // Create a new BufferedReader
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt for array size
        System.out.print("| Array Size: ");
        int arraySize = Integer.parseInt(buffReader.readLine());

        // Initialize an array to store user inputs
        int userArray[] = new int[arraySize];

        System.out.print("| Input #1: ");
        userArray[0] = Integer.parseInt(buffReader.readLine());

        // Set initial values for comparisons
        int findLargest = userArray[0];
        int findSmallest = userArray[0];
        float inputAverage = userArray[0];

        // Loop through the array to get inputs and calculate largest, smallest, and sum
        for (int i = 1; i < arraySize; i++) {
            System.out.print("| Input #" + (i + 1) + ": ");
            userArray[i] = Integer.parseInt(buffReader.readLine());
            if (userArray[i] > findLargest) {
                findLargest = userArray[i];
            }
            if (userArray[i] < findSmallest) {
                findSmallest = userArray[i];
            }
            inputAverage += userArray[i];
        }

        // Calculate the average
        inputAverage = inputAverage/arraySize;

        // Display results
        System.out.println("| Largest input: " + findLargest);
        System.out.println("| Smallest input: " + findSmallest);
        System.out.println("| Input Average: " + inputAverage);
    }
}
