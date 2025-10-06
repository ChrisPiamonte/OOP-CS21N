/*
 *  ==========================================================
 *      Machine Problem 2 - Basic Programming Exercise
 *  ==========================================================
 *  Item 11 -  Magic Number with Steps
 * 
 *  Instruction:
 *  A Magic Number is a number that eventually becomes 1 when
 *  replaced repeatedly with the sum of the squares of its digits.
 *  Write a program to check whether a number is a Magic Number
 *  and display the step-by-step transformation.
 *  ==========================================================
*/
    
import java.util.Scanner;

public class Item11 {

    // Method to calculate sum of squares of digits
    public static int sumOfSquares(int currentNumber) {
        int sumOfDigits = 0;
        int temporaryVariable = currentNumber;

        // Calculate the sum of each digit's square
        while (currentNumber > 0) {
            int lastDigit = currentNumber % 10;         // get the last digit
            System.out.print(lastDigit + "^2 ");
            sumOfDigits += lastDigit * lastDigit;          // add the square of the digit
            currentNumber /= 10;                       // remove the last digit from the number
            if (currentNumber > 0) {
                System.out.print("+ ");
            }
        }
        System.out.println("= " + sumOfDigits);
        System.out.println(temporaryVariable + " -> " + sumOfDigits);
        System.out.println();
        return sumOfDigits;
    }

    // Method to check if the current number is already in the array
    public static boolean contains(int[] seenNumbers, int countNumbers, int currentNumber) {
        for (int i = 0; i < countNumbers; i++) {
            if (seenNumbers[i] == currentNumber)
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        scanner.close();
        System.out.println("---------------------\n");

        int[] seenNumbers = new int[1000];       // store numbers seen so far
        int countNumbers = 0;                        // number of elements stored
        int currentNumber = userNumber;                // current number

        // Check if the number is a magic number
        while (currentNumber != 1) {

            // Check if the current number is already in the array
            if (contains(seenNumbers, countNumbers, currentNumber)) {
                System.out.println("------------------------------------------");
                System.out.println("Loop detected. " + userNumber + " is NOT a Magic Number.");
                return;
            }

            // Store current number in the array
            seenNumbers[countNumbers] = currentNumber;
            countNumbers++;

            // Calculate next number
            currentNumber = sumOfSquares(currentNumber);
        }
        System.out.println("---------------------");
        System.out.println(userNumber + " is a Magic Number!");
    }
}