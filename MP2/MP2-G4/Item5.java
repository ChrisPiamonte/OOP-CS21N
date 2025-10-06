import java.util.Scanner;

public class Item5 {

    public static void palindromeChecker(int[] intNumber, int intAmount) {
        for(int i = 0; i < intAmount; i++) {
            String strNumber = Integer.toString(intNumber[i]);
            boolean blnIsPalindrome = true;

            for(int j = 0; j < strNumber.length()/2; j++) {
                if(strNumber.charAt(j) != strNumber.charAt(strNumber.length() - 1 - j)) {
                    blnIsPalindrome = false;
                    break;
                }
            }
            if(blnIsPalindrome) {
                System.out.println(intNumber[i] + " is a palindrome.");
            }
        }
    }
    public static void main(String[] args) {
            int intAmount = 0;
            
            System.out.println("Enter amount of numbers to check: ");
            Scanner input = new Scanner(System.in);
            intAmount = input.nextInt();

            int[] arrPalindromes = new int[intAmount];
            
            for(int i = 0; i < intAmount; i++) {
                System.out.println("Enter number [" + (i + 1) + "]: ");
                arrPalindromes[i] = input.nextInt();
            }
            palindromeChecker(arrPalindromes, intAmount);

        }

}
