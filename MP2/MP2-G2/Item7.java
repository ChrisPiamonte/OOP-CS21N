import java.util.*;

// should use method (function) for number reversal?

public class Item7 {
    public static int numberReversal (int intNumber, int intDivisor) {
        int intReversedNumber = 0;

        // reverse the number 
        while (intNumber != 0) {
            int digit = intNumber % intDivisor;
            intReversedNumber = (intReversedNumber * intDivisor) + digit;
            intNumber /= intDivisor;
        }

        return intReversedNumber;
    }

    public static void main(String[] args) {
        int intDivisor = 10;

        System.out.println("Number Reversal and Check");

        Scanner objScanner = new Scanner(System.in);
        // user input intNumber
        System.out.print("Enter number: ");
        int intNumber = objScanner.nextInt();

        System.out.println("Original number: " + intNumber);

        int intReversedNumber = numberReversal(intNumber, intDivisor);

        // prints reversed number
        System.out.println("Reversed number: " + intReversedNumber);

        // palindrome check
        if (intNumber == intReversedNumber) {
            System.out.println("Palindome = Yes");
        } else {
            System.out.println("Paldinrome = No");
        }

        objScanner.close();
    }
}
