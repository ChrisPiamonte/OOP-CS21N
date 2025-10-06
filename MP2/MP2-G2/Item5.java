import java.util.Scanner;
public class Item5 {
    // method to check if the number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        
        return reversedNumber == originalNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        
        System.out.println("How many numbers?");
        int totalInputs = in.nextInt();
        int[] palindromeNumbers = new int[totalInputs];
        int palindromeIndex = 0;
        int inputIndex = 0;

        while (inputIndex < totalInputs) {
            System.out.println("Enter a Number:");
            number = in.nextInt();
            
            //calling of the method
            if (isPalindrome(number)) {
                palindromeNumbers[palindromeIndex] = number;
                palindromeIndex++;
            }
            inputIndex++;
        }

        // displaying palindrome numbers:
        System.out.println("Palindromes:");
        for (int i = 0; i < palindromeIndex; i++) {
            System.out.print(palindromeNumbers[i] + " ");
        }
        
        in.close();
    }
}
