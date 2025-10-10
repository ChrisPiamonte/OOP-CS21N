import java.util.Scanner;
/* Item 5: Palindrome Number Checker (Multiple Inputs) */

public class Item5 {

    /*  Check if a number is a palindrome.
     * A Palindrome is a number that still the same even in reverse
     * Ex: 121, 505, 100001 
     */

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = ""; //

        // Reverse the string manually using a loop
        for (int index = original.length() - 1; index >= 0; index--) {
            reversed += original.charAt(index);
        }

        return original.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many numbers they want to enter
        System.out.print("How many numbers do you want to input? ");
        int intSize = sc.nextInt();

        // Create an array to store the numbers
        int[] arrTerm = new int[intSize];

        // Input numbers
        System.out.println("Enter the numbers:");
        for (int index = 0; index < intSize; index++) {
            arrTerm[index] = sc.nextInt();
        }

        // Check for palindromes and display them
        System.out.println("Palindrome numbers found:");
        boolean foundPalindrome = false;
        for (int index = 0; index < intSize; index++) {
            if (isPalindrome(arrTerm[index])) {
                System.out.println(arrTerm[index]);
                foundPalindrome = true;
            }
        }

        if (!foundPalindrome) {
            System.out.println("No palindrome numbers found.");
        }

        sc.close();
    }
}
