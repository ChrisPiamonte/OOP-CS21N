// 14. Second Largest and Second Smallest Number
// Write a program that finds both the second largest and second smallest numbers in an array of
// integers provided by the user.

import java.util.Scanner;
import java.util.Arrays;

public class Item14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repeat;

        do {
            System.out.println("\n--- Second Largest and Second Smallest ---");
            int n = 0;

            // Input number of elements with validation (minimum 2)
            while (true) {
                System.out.print("Enter number of elements (>=2): ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n >= 2) break;
                    else System.out.println("Please enter a number 2 or greater.");
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

            int secondSmallest = arr[1];
            int secondLargest = arr[n - 2];

		    System.out.println("");
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);

            // Ask to repeat
            System.out.print("Try again? (y/n): ");
            repeat = sc.next().toLowerCase().charAt(0);
            sc.nextLine();  // clear buffer
        } while (repeat == 'y');

        System.out.println("Thank you for using the program~");
    }
}