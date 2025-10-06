import java.util.Scanner;

public class Item10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intNum;
        
        // Input number
        System.out.println("Enter an integer: ");
        intNum = input.nextInt();


        int intCount = 0;   
        int intLargest = 0;
        if (intNum == 0) {  // Edge case for 0
            intCount = 1;
            intLargest = 0;
        }
        while (intNum > 0) {    // Loop to count digits and find largest digit
            int intDigit = intNum % 10;
            intCount++;            
            if (intDigit > intLargest)
                intLargest = intDigit;  
            intNum = intNum / 10;  
        }

        // Output results
        System.out.println("Number of digits: " + intCount);
        System.out.println("Largest digit: " + intLargest);
    }
}
