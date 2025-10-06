import java.util.Scanner;

public class Item4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user for the starting and ending number of the range
        System.out.print("Enter the starting number: ");
        int startingNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endingNumber = scanner.nextInt();

        System.out.println("Armstrong numbers between " + startingNumber + " and " + endingNumber + " are:");

        // loop through all numbers within the given range
        for (int currentNumber = startingNumber; currentNumber <= endingNumber; currentNumber++) {
            int originalNumber = currentNumber; // keep the original value for checking later
            int total = 0; // will store the sum of powered digits
            int digitCount = String.valueOf(currentNumber).length(); // count the number of digits

            // extract each digit and raise it to the power of digitCount
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                total += Math.pow(digit, digitCount);
                originalNumber /= 10;
            }

            // check if the number is an Armstrong number
            if (total == currentNumber) {
                System.out.println(currentNumber);
            }
        }

        scanner.close(); // close the scanner to prevent memory leaks
    }
}
