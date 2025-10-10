import java.util.Scanner; // Import Scanner for user input

public class Item3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter ending number: ");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Loop all in the range
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                // Check if divisible by any number between 2 and i-1
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // If still prime, print it
            if (isPrime) {
                System.out.print(i + " ");
                count++; // Increase count
            }
        }

        // After loop, show total number of primes found
        System.out.println("\nTotal prime numbers found: " + count);
    }

}
