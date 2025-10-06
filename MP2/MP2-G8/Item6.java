import java.util.*;

public class Item6 {
static int intSumOfDigits(int intNumber) {
        // Loop to repeat as long as number has more than one digit
        while (intNumber >= 10) { 
        //Declare Variables for calculating multiple digits up until single digit
            int intSum = 0;
            int intTemp = intNumber;

            // Sum all digits
            while (intTemp > 0) {
                intSum += intTemp % 10; 
                intTemp /= 10;       
            }
            intNumber = intSum; 
        }
        // Return the single-digit result
        return intNumber; 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Ask user input for a number
        System.out.print("Enter a number: ");
        int intNum = scan.nextInt();

        //Call method 
        int intResult = intSumOfDigits(intNum);

        //Print Output
        System.out.println("Single digit result: " + intResult);

        scan.close();
    }

}