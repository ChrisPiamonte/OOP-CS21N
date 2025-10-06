import java.util.*;

// LCM of Multiple Numbers

public class Item9 {
    static int gcd(int a, int b) {
        // Iteration (Euclid's Algorithm)
        // Recursive: gcd(a, b) = gcd(b, a mod b)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int gcdMultiple(int[] nums) {
        int prev = nums[0];

        for (int i = 1; i < nums.length; ++i)
            prev = gcd(prev, nums[i]);

        return prev;
    }

    static int lcm(int[] nums) {
        int prev = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int a = prev, b = nums[i];

            // Iterative Approach
            // lcm(a, b) = (a * b) / gcd(a, b)
            prev = (a * b) / gcd(a, b);
        }

        return prev;
    }

    static int[] getInputNumbers() {
        // Usage of try to avoid resource leak
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the Amount of Numbers to be Processed: ");

            // Validator
            if (!scanner.hasNextInt()) {
                System.out.println("Please provide a valid number!");
                return new int[] {};
            }

            int n = scanner.nextInt();
            if (n < 1) {
                System.out.println("The number of numbers to be processed cannot be less than 1");
                return new int[] {};
            }

            int[] numbers = new int[n];
            for (int i = 0; i < n; ++i) {
                System.out.println("Enter a/the Number(s) to be Processed: ");
                numbers[i] = scanner.nextInt();
            }

            return numbers;
        }
    }

    static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = getInputNumbers();

        System.out.println("\nNumbers:");
        printNumbers(input);

        int leastCommonMultiple = lcm(input);
        System.out.println("Least Common Multiple (LCM): " + leastCommonMultiple);
    }
}
