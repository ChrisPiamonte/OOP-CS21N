package MP2;

import java.util.Scanner;

public class Item8 {
    // Function to find GCD of two numbers
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers in the array? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int gcd = numbers[0];

        // Compute GCD of all numbers
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }

        System.out.println("The GCD of all numbers is: " + gcd);
    }
}
