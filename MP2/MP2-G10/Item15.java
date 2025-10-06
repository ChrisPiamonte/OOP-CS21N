/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 15 - Sorting an Array in Ascending and Descending Order
 * 
 *  Instruction:
 *  Create a program that accepts n numbers, stores them in an 
 *  array, and sorts them in both ascending and descending order.
 *  Display both results.
 *  ==========================================================
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Item15 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

        // Prompt for array size
        System.out.print("| Array Size: ");
        int arraySize = Integer.parseInt(buffReader.readLine());

        // Initialize Array
        int userArray[] = new int[arraySize];

        // Prompts the user to fill array
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| Array Value #" + (i + 1) + ": ");
            userArray[i] = Integer.parseInt(buffReader.readLine());
        }

        System.out.println("|--------------------------------");
        // Ascending Sort [Insertion Sort]
        for (int i = 1; i < arraySize; i++) {
            int j = i - 1;
            int key = userArray[i];

            while (j >= 0 && userArray[j] > key) {
                userArray[j + 1] = userArray[j];
                j--;
            }
            userArray[j + 1] = key;
        }

        // Print terms in Ascending Order
        System.out.print("| Ascending Order: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(userArray[i] + " ");
        }

        // Descending Sort [Reverse Insertion Sort]
        for (int i = 1; i < arraySize; i++) {
            int key = userArray[i];
            int j = i - 1;

            while (j >= 0 && userArray[j] < key) {
                userArray[j + 1] = userArray[j];
                j--;
            }
            userArray[j + 1] = key;
        }

        // Print terms in Descending Order
        System.out.print("\n| Descending Order: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(userArray[i] + " ");
        }
    }
}
