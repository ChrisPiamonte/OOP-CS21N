/*Sum of Even and Odd Numbers with Difference
Write a program that accepts a range of numbers, computes separately the sum of even numbers
and odd numbers, and also finds the difference between the two sums.*/

import java.util.Scanner;

class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Even-Odd Sum and Difference Analyzer! ---");

        // Input range
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        // Loop through the range
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        int difference = Math.abs(sumEven - sumOdd);

        // Display results
        System.out.println("\nYou entered the range: " + start + " to " + end);
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Difference between the two sums: " + difference);

        scanner.close();
    }
}
