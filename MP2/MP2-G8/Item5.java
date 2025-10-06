import java.util.*;

public class Item5 {
    static boolean boolPalindromeChecker(int intNum) {
	//Declare Variables for Palindrome Checker
        int intOriginalNum = intNum;   
        int intReversedNum = 0;        

        // Reverse the number
        while (intNum > 0) {
            int intDigit = intNum % 10;             
            intReversedNum = intReversedNum * 10 + intDigit; 
            intNum /= 10;                           
        }

        // Return true if the original and reversed numbers are equal
        return intOriginalNum == intReversedNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user input how many elements 
        System.out.print("Enter the number of elements: ");
        int intCount = scan.nextInt();

        // Create an array to store user input numbers
        int[] intNumbers = new int[intCount];
        System.out.println("Enter " + intCount + " numbers:");

        // use loop to iterate all numbers
        for (int i = 0; i < intCount; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            intNumbers[i] = scan.nextInt();
        }

        // Display all palindrome numbers found
        System.out.print("\nPalindrome numbers found: ");
        boolean boolFound = false; // Flag to check if any palindrome was found
        
        //Print either there are palindrome numbers or none
        for (int intNum : intNumbers) {
            if (boolPalindromeChecker(intNum)) {
                System.out.print(intNum + " ");
                boolFound = true;
            }
        }

        if (!boolFound) {
            System.out.print("None");
        }

        scan.close(); // Close the scanner
    }
}