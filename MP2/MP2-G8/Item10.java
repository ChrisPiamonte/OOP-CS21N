import java.util.*;

public class Item10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declare a number
        int intNumber;
        int intCount = 0;
        int intLargestDigit = 0;

        System.out.print("Enter a number: ");
        intNumber = scan.nextInt();

        int intTemp = intNumber;  //temporary variable for intNumber

        //Extract each digit of intNumber  
        while (intTemp > 0) {
            int intLastDigit = intTemp % 10;
            if (intLastDigit > intLargestDigit) {
                intLargestDigit = intLastDigit; //update the largest digit
            }
            intTemp /= 10;
            intCount++;
        }

        //Print the number of digits of intNumber and its largest digit 
        System.out.println("There are " + intCount + " digits in " + intNumber + " and the largest digit is " + intLargestDigit);

        scan.close();
    }
}