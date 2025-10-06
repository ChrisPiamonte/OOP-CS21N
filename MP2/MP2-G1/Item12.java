import java.util.Scanner;

public class Item12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Input the starting number: ");
        int startNumber = scanner.nextInt();

        // Ask the user for the ending number
        System.out.print("Input the ending number: ");
        int endNumber = scanner.nextInt();

        // To store the sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;

        // Loop through all numbers in the range
        for (int number = startNumber; number <= endNumber; number++) {
            if (number % 2 == 0) {
                evenSum += number; // Add to even sum
            } else {
                oddSum += number; // Add to odd sum
            }
        }

        // Compute the difference
        int difference;
        if (evenSum > oddSum) {
            difference = evenSum - oddSum;
        } else {
            difference = oddSum - evenSum;
        }

        // Display results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Difference between sums: " + difference);

        scanner.close(); // Close the scanner
    }
}
