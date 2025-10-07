import java.util.Scanner;

public class Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intDigits = 0; // total number of digits.
        int intNum; // user input
        int intLargestDigit = 0; // largest digit
        int intOriginalNum = 0; // just a copy of user input
        int intTempNum;// temporary value holder for the loop

        System.out.printf("Enter a number: ");
        intNum = scanner.nextInt();

        intOriginalNum = intNum;

        if (intNum == 0) {
            intDigits = 1;
            intLargestDigit = 0;
        }
        // turns negative integer to positive.
        else if (intNum < 0) {
            intNum = -intNum;
            intOriginalNum = -intOriginalNum;
        }

        while (intNum > 0) {
            intNum /= 10;
            intDigits++; // to identify the number of digits.

            intTempNum = intOriginalNum % 10;
            intOriginalNum /= 10;

            // to identify the largest digit.
            if (intTempNum > intLargestDigit) {
                intLargestDigit = intTempNum;
            }
        }

        System.out.println("Number of Digits: " + intDigits); // prints the number of digits
        System.out.println("Largest Digit: " + intLargestDigit); // prints the largest digit

        scanner.close();
    }
}