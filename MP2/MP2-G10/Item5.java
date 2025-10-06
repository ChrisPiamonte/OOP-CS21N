import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask the user how many numbers they want to check
        System.out.print("Enter how many numbers you want to check: ");
        int numberCount = scanner.nextInt();

        System.out.println("Enter the numbers:");

        // loop through each number entered by the user
        for (int i = 0; i < numberCount; i++) {
            int inputNumber = scanner.nextInt();
            int reversedNumber = 0;
            int originalNumber = inputNumber;

            // reverse the digits of the number
            while (inputNumber != 0) {
                int digit = inputNumber % 10;
                reversedNumber = reversedNumber * 10 + digit;
                inputNumber /= 10;
            }

            // check if the original number and reversed number are the same
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a Palindrome.");
            } else {
                System.out.println(originalNumber + " is NOT a Palindrome.");
            }
        }

        scanner.close(); // close the scanner
    }
}
