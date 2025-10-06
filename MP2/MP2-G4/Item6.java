import java.util.Scanner;

public class Item6 {
    static int count = 0; // Counter to track the number of digit additions

    // Method to recursively sum the digits of a number until a single digit is obtained
    public static int sumOfDigits(int intNumber) {
        String strNumber = Integer.toString(intNumber); // Convert number to string for digit access
        int intSum = 0; // Initialize sum

        // Base case: if the number is already a single digit, return it
        if(strNumber.length() == 1) {
            return intNumber;
        }

        // Loop through each digit, add to sum, and print the operation
        for(int i = 0; i < strNumber.length(); ++i) {
            count++; // Increment the counter for each addition
            System.out.println("Iteration " + (count) + ": " + intSum + " + " + Character.getNumericValue(strNumber.charAt(i)) + " = " + (intSum + Character.getNumericValue(strNumber.charAt(i))));
            intSum += Character.getNumericValue(strNumber.charAt(i));
        }

        System.out.println("Sum: " + intSum); // Print the sum after one pass

        count = 0; // Reset counter for the next recursive call

        // Recursively call the method with the new sum
        return(sumOfDigits((intSum)));
    }

    public static void main(String[] args) {
        int intNumber = 0;
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Please enter a number: ");
        intNumber = input.nextInt();

        // Call the sumOfDigits method and print the final single digit sum
        System.out.println("The single digit sum is: " + sumOfDigits(intNumber));
    }
}
