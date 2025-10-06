// 15. Sorting an Array in Ascending and Descending Order
// Create a program that accepts n numbers, stores them in an array, and sorts them in both
// ascending and descending order. Display both results.

import java.util.Scanner;
import java.util.Arrays;

public class Item15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repeat;

        do {
            System.out.println("\n--- Sorting Array Ascending and Descending ---");
            int n = 0;

            // Input number of elements with validation
            while (true) {
                System.out.print("Enter number of elements (positive integer): ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n > 0) break;
                    else System.out.println("Please enter a positive number.");
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next();
                }
            }

            int[] arr = new int[n];
            System.out.println("Enter " + n + " numbers:");

            // Input array elements with validation
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print("Number " + (i + 1) + ": ");
                    if (sc.hasNextInt()) {
                        arr[i] = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        sc.next();
                    }
                }
            }

            Arrays.sort(arr);

            System.out.println("");
            System.out.print("Ascending order: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.print("\nDescending order: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Ask to repeat
            System.out.print("Try again? (y/n): ");
            repeat = sc.next().toLowerCase().charAt(0);
            sc.nextLine();  // clear buffer
        } while (repeat == 'y');

        System.out.println("Thank you for using the program~");
    }
}