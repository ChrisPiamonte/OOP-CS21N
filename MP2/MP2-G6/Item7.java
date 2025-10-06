import java.util.Scanner;

public class Item7{
    
    // Reverse method
    public static int reverseNumber(int numberToReverse){
        int reversedNumber = 0;

        while(numberToReverse > 0){
            int digit = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numberToReverse /= 10;
        }
        
        return reversedNumber;
    }

    // Palidrome method
    public static boolean palindromeCheck(int numberToCheck){
        return numberToCheck == reverseNumber(numberToCheck);
    }
    
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Please input a number to reverse: ");
        int numberToReverse = inputScanner.nextInt();   

        // Error handler 
        if(numberToReverse < 0){
            System.out.println("Please enter a positive integer");
            inputScanner.close();
            return;
        }

        // Display the reverse
        int reversedNumber = reverseNumber(numberToReverse);
        System.out.println("The reversed number of " + numberToReverse + " is " + reversedNumber);

        // Check if palindrome
        if(palindromeCheck(numberToReverse)){
            System.out.println("Number " + numberToReverse + " is a Palindrome.");
        } else {
            System.out.println("Number " + numberToReverse + " is not a Palindrome");
        } 

        inputScanner.close();
    }
}