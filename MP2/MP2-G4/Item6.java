import java.util.Scanner;

public class Item6 {
    static int count = 0;
    public static int sumOfDigits(int intNumber) {
      
        String strNumber = Integer.toString(intNumber);
        int intSum = 0;
        if(strNumber.length() == 1) {
            return intNumber;
        }
        for(int i = 0; i < strNumber.length(); ++i) {
            count++;
            System.out.println("Iteration " + (count) + ": " + intSum + " + " + Character.getNumericValue(strNumber.charAt(i)) + " = " + (intSum + Character.getNumericValue(strNumber.charAt(i))));
            intSum += Character.getNumericValue(strNumber.charAt(i));
        }
        System.out.println("Sum: " + intSum);
        count = 0;
        return(sumOfDigits((intSum)));
    }
    public static void main(String[] args) {
        int intNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        intNumber = input.nextInt();
        System.out.println("The single digit sum is: " + sumOfDigits(intNumber));
        
    }
}
