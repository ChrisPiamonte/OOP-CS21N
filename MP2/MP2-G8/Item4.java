import java.util.*;

public class Item4 {
    static boolean boolArmstrongChecker(int intNum) {
        //Declare variables for Boolean Checker
        int intOriginalNum = intNum;
        int intDigits = 0;
        int intSum = 0;

        // Count digits
        int intTemp = intNum;
        while (intTemp > 0) {
            intTemp /= 10;
            intDigits++;
        }
        
        // Compute the sum of each digit raised to the power of the number of digits
        intTemp = intNum;
        while (intTemp > 0) {
            int intDigit = intTemp % 10;
            intSum += Math.pow(intDigit, intDigits);
            intTemp /= 10;
        }

        return intSum == intOriginalNum;
    }
    
    public static void main(String[] args) {
        //Declare Variable for range of numbers
        int intStart, intEnd;

        Scanner scan = new Scanner(System.in);
        
        //Get user input for the beginning of the range of numbers
        System.out.print("Enter starting number: ");
        intStart = scan.nextInt();
    
        //Get user input for the beginning of the range of numbers
        System.out.print("Enter ending number: ");
        intEnd = scan.nextInt();
        
        //Print output
        System.out.print("Armstrong numbers between " + intStart + " and " + intEnd + " are: ");
        for (int i = intStart; i <= intEnd; i++) {
            if (boolArmstrongChecker(i)) {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}