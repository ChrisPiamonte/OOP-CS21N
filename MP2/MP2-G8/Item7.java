import java.util.*;

public class Item7 {
    static Scanner console = new Scanner (System.in);
    public static void main (String[] args){
        int intNumber, intPalindrome = 0, intReal, intTemp;
        
        //Asks the user a number
        System.out.print("Enter a number: ");
        intNumber=console.nextInt();
        intReal = intNumber;
        
        //Reverses the number
        while(intNumber != 0){
            intTemp = intNumber % 10;
            intPalindrome = intPalindrome*10 + intTemp;
            intNumber /= 10;
        }
        
        //Prints out the reversed number
        System.out.println("The reversed number of " + intReal + " is " + intPalindrome);
        
        //Checks if the number is a palindrome or not
        if(intReal == intPalindrome){
            System.out.println("The number " + intReal + " is a palindrome.");
        }else{
            System.out.println("The number " + intReal + " is not a palindrome.");
        }
    }
}