/**
 * Second Largest and Second Smallest Number
 *
 * Write a program that finds both the second largest and second smallest numbers
 * in an array of integers provided by the user.
 */
import java.util.Scanner;

public class Item14 {

    // Finds the second smallest number in an array.
    public static double findSecondSmallest(double[] numbers, int count) {
        double smallest = Double.MAX_VALUE;
        double secondSmallest = Double.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        return secondSmallest;
    }

    // Finds the second largest number in an array.
    public static double findSecondLargest(double[] numbers, int count) {
        double largest = Double.MIN_VALUE;
        double secondLargest = Double.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ Second Smallest & Second Largest Number Finder ]\n");
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Error: You need at least 2 numbers!");
            sc.close();
            return;
        }

        double[] numbers = new double[size];

        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }

        // Display array
        System.out.print("\nYour array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Compute results
        double secondSmallest = findSecondSmallest(numbers, size);
        double secondLargest = findSecondLargest(numbers, size);

        // Handle cases where there is no distinct 2nd value
        if (secondSmallest == Double.MAX_VALUE) {
            System.out.println("\nThere is no distinct second smallest number (all values are same).");
        } else {
            System.out.println("\nSecond Smallest: " + secondSmallest);
        }

        if (secondLargest == Double.MIN_VALUE) {
            System.out.println("There is no distinct second largest number (all values are same).");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        sc.close();
    }
}
