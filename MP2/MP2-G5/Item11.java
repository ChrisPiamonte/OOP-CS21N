import java.util.Scanner;

public class Item11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a magic number program! It shows the steps of summing the squares of digits.");
        int numDigits = 0;

        // Ask how many digits
        while (true) {
            System.out.print("How many digits do you want your number to be? (1-4): ");
            if (scanner.hasNextInt()) {
                numDigits = scanner.nextInt();
                if (numDigits >= 1 && numDigits <= 4) break;
            } else {
                scanner.next(); // consume bad input
            }
            System.out.println("Please enter a number between 1 and 4.");
        }

        // Read digits one by one into an array
        int[] digits = new int[numDigits];
        System.out.println("Enter the digits one by one (0-9):");
        for (int i = 0; i < numDigits; i++) {
            while (true) {
                System.out.print("Digit " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int d = scanner.nextInt();
                    if (d >= 0 && d <= 9) {
                        digits[i] = d;
                        break;
                    }
                } else {
                    scanner.next(); // consume bad token
                }
                System.out.println("Invalid digit. Try again (0-9).");
            }
        }

        // Build the starting number from the digits
        int number = 0;
        for (int i = 0; i < numDigits; i++) {
            number = number * 10 + digits[i];
        }

        int original = number; // store original for final message
        System.out.println("\nStarting number: " + number);

        // Simple array to remember seen numbers
        int[] seen = new int[100];
        int seenCount = 0;

        while (true) {
            int temp = number;

            // extract digits of current number
            int[] rev = new int[10];
            int len = 0;
            if (temp == 0) {
                rev[len++] = 0;
            } else {
                while (temp > 0) {
                    rev[len++] = temp % 10;
                    temp /= 10;
                }
            }
            int[] curDigits = new int[len];
            for (int i = 0; i < len; i++) curDigits[i] = rev[len - 1 - i];

            // build and print the "digit^2 + ... = sum" line
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                int d = curDigits[i];
                sum += d * d;
                sb.append(d).append("^2");
                if (i < len - 1) sb.append(" + ");
            }
            sb.append(" = ").append(sum);
            System.out.println(sb.toString());

            // check if we reached 1
            if (sum == 1) {
                System.out.println(original + " is a MAGIC number!");
                break;
            }

            // check if we are looping
            boolean seenBefore = false;
            for (int i = 0; i < seenCount; i++) {
                if (seen[i] == sum) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) {
                System.out.println("Sequence entered a loop. " + original + " is NOT a magic number.");
                break;
            }

            // store sum and continue
            if (seenCount < seen.length) seen[seenCount++] = sum;
            number = sum;

            // safety guard
            if (seenCount >= seen.length - 1) {
                System.out.println("Reached iteration limit, stopping.");
                break;
            }
        }

        scanner.close();
    }
}
