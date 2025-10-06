// 13. Array Maximum, Minimum, and Average
// Ask the user to enter n numbers, store them in an array, and determine the largest number,
// smallest number, and the average of all numbers.

import java.util.Scanner;

public class Item13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repeat;

        do {
            System.out.println("\n--- Array Max, Min, and Average ---");
            int n = 0;

            // Input number of elements with validation
            while (true) {
                System.out.print("Enter number of elements (positive integer): ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n > 0) break;
                    else System.out.println("Please enter a positive number.");
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    sc.next(); // clear invalid input
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

            int max = arr[0], min = arr[0], sum = 0;
            for (int num : arr) {
                if (num > max) max = num;
                if (num < min) min = num;
                sum += num;
            }

            double avg = (double) sum / n;
		    System.out.println("");
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.printf("Average: %.2f\n", avg);

            // Ask to repeat
            System.out.print("Try again? (y/n): ");
            repeat = sc.next().toLowerCase().charAt(0);
            sc.nextLine();  // clear buffer
        } while (repeat == 'y');

        System.out.println("Thank you for using the program~");
    }
}