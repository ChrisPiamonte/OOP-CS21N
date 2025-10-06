import java.util.Scanner;

/* Item 7. Number Reversal and Check */

public class Item7 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        // Ask user for a number
        System.out.println("Input a number: ");
        int intInputNum = objScanner.nextInt();
        objScanner.close();

        // Reverse inputted number
        int intReversed = 0, intRemainder = 0, intTemp = intInputNum;
        while (intTemp != 0) {
            intRemainder = intTemp % 10; // Get the last digit
            intReversed = intReversed * 10 + intRemainder; // Place digit subsequently
            intTemp /= 10; // Update until no more digits
        }

        // Display results
        System.out.println("Original Number: " + intInputNum);
        System.out.println("Reversed Number: " + intReversed);

        // Check and display if original and reverse are equal
        if (intInputNum == intReversed) {
            System.out.println(intInputNum + " is a palindrome number.");
        } else {
            System.out.println(intInputNum + " is NOT a palindrome number.");
        }

    }
}