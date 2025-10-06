import java.util.*;

public class Item10 {
    public static void main(String[] args) {
        System.out.println("Count Digits and Find Largest Digit");

        // user input intNumber
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int intNumber = objScanner.nextInt();

        int intCounter = 0;
        int intLargestDigit = 0; 
        int intDivior = 10;

        // loop for counting the digits 
        int intTemp = intNumber; 
        while (intTemp > 0) {
            int intDigit = (intNumber % intDivior); 
            intCounter++;
            if (intDigit > intLargestDigit) {
                intLargestDigit = intDigit;
            }
            intTemp /= intDivior;
        }

        System.out.println("Original number: " + intNumber);
        System.out.println("Total number of digits: " + intCounter);
        System.out.println("Largest digit: " + intLargestDigit);

        objScanner.close();
    }
}
