/*
Create a program that asks the user for several numbers and computes their Least Common
Multiple (LCM).
*/

import java.util.Scanner;

public class item9 {
    
    // Method to compute GCD (Greatest Common Divisor) using Euclid's algorithm
    // This is used inside the LCM method
    public static int gcd(int a, int b) {
        while (b != 0) {         // keep going until remainder becomes 0
            int temp = b;        // store current b
            b = a % b;           // set b to the remainder of a ÷ b
            a = temp;            // move previous b into a
        }
        return a;                // when b = 0, a is the GCD
    }

    // Method to compute LCM (Least Common Multiple) of two numbers
    // Formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to input
        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        // Array to store all the input numbers
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // read each number
        }

        // Compute the LCM of all numbers in the array step by step
        int result = numbers[0];           // start with the first number
        for (int i = 1; i < n; i++) {
            result = lcm(result, numbers[i]); // update result with LCM of current result and next number
        }

        // Print the final LCM result
        System.out.println("LCM of the given numbers is: " + result);

        scanner.close(); // close scanner to avoid resource leak
    }
}
