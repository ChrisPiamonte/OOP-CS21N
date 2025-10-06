import java.util.Scanner;
public class Item7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number Reversal Checker Program");

        //Asks the user to input a number
        System.out.print("Enter a number: ");
        int intNumber = input.nextInt();

        int intOriginal = intNumber; //Variable for stroring the  original number for comparison
        int intReversed = 0; //Variable to store the reversed order

        while (intNumber != 0){
            int intDigit = intNumber % 10; //Extracts the last digit
            intReversed = intReversed * 10 + intDigit; // Add digit to reversed
            intNumber /= 10; // Removes the last digit from the number
        }

        //Prints the reversed order of the number
        System.out.println("Reversed number: " + intReversed);

        //Checks if Palindrome
        if (intOriginal == intReversed){
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome. ");
        }

        input.close();
    }
}

