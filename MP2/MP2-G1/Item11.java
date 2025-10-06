import java.util.Scanner;

/* Item 11. Magic Number with Steps */

public class Item11 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);     

        // Ask user for a number
        System.out.println("Input a number: ");
        int intInputNum = objScanner.nextInt();
        int intNext = intInputNum, intTemp = 0, intDigit = 0;

        objScanner.close(); // Close scanner

        // Flags for display and repeating numbers
        boolean boolFirst = true, boolCycle = false;
        int intSingle = 0;

        // Loop until result is 1 or repeat cycle is detected
        while (intNext != 1) {
            
            intTemp = intNext; // Assign current number to solve
            intNext = 0; // Reset for next number
            boolFirst = true;

            // Display current number
            System.out.print(intTemp + " -> ");

            // Seperate number's digits and sum its squares
            while (intTemp != 0) {
                intDigit = intTemp % 10;
                intNext += intDigit * intDigit;
                intTemp /= 10;

                // Print step-by-step format of process
                if (!boolFirst) System.out.print(" + ");
                boolFirst = false;
                System.out.print(intDigit + "^2");
            }

            // Display sum or next number
            System.out.println(" = " + intNext);
            
            // Check and show if single digit result repeats atleast once before evaluation
            if (intNext != 1 && intNext < 9) {
                if (!boolCycle || intSingle != intNext) {
                    boolCycle = true;
                    intSingle = intNext; // Keep track of latest single digit
                } else {break;}
            }
        }

        /* A Magic Number is a number that eventually becomes 1 
            when replaced repeatedly with the sum of the squares of its digits. */

        // Display and check if number is a magic number
        if (intNext == 1) {
            System.out.println(intInputNum + " is a magic number.");
        } else {
            System.out.println(intInputNum + " is NOT a magic number.");
        }
    }
}