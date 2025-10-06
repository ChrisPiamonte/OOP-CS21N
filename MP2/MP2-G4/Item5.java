import java.util.Scanner;

public class Item5 {

    // Method to check if numbers in the array are palindromes
    public static void palindromeChecker(int[] intNumber, int intAmount) {
        // Loop through each number in the array
        for(int i = 0; i < intAmount; i++) {
            String strNumber = Integer.toString(intNumber[i]); // Convert number to string
            boolean blnIsPalindrome = true; // Assume number is a palindrome

            // Check if the number is a palindrome by comparing characters from both ends
            for(int j = 0; j < strNumber.length()/2; j++) {
                if(strNumber.charAt(j) != strNumber.charAt(strNumber.length() - 1 - j)) {
                    blnIsPalindrome = false; // Not a palindrome if mismatch found
                    break;
                }
            }
            // Print result if number is a palindrome
            if(blnIsPalindrome) {
                System.out.println(intNumber[i] + " is a palindrome.");
            }
        }
    }

    public static void main(String[] args) {
        int intAmount = 0;
        
        // Prompt user for the number of integers to check
        System.out.println("Enter amount of numbers to check: ");
        Scanner input = new Scanner(System.in);
        intAmount = input.nextInt();

        int[] arrPalindromes = new int[intAmount]; // Array to store the numbers
        
        // Input each number from the user
        for(int i = 0; i < intAmount; i++) {
            System.out.println("Enter number [" + (i + 1) + "]: ");
            arrPalindromes[i] = input.nextInt();
        }
        // Call the palindrome checker method
        palindromeChecker(arrPalindromes, intAmount);
    }

}
