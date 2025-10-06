import java.util.*;

// Java program to find Armstrong numbers in a given range
public class Item4{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Armstrong Numbers in a Range");

        // Prompt user for the range
        System.out.print("Enter number for range 1: ");
        int intRange1 = inputScanner.nextInt();

        System.out.print("Enter number for range 2: ");
        int intRange2 = inputScanner.nextInt();


        // Ensure intRange1 is less than intRange2
        if (intRange1 > intRange2) {
            int temp = intRange1;
            intRange1 = intRange2;
            intRange2 = temp;
        }

        // Find and print Armstrong numbers in the given range
        System.out.println("Armstrong numbers between " + intRange1 + " and " + intRange2 + " are:");
        for (int i = intRange1; i <= intRange2; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
        }
        inputScanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int intNumber) {
        int originalNumber = intNumber;
        int sum = 0;
        int digits = String.valueOf(intNumber).length();

        while (intNumber != 0) {
            int digit = intNumber % 10;
            sum += Math.pow(digit, digits);
            intNumber /= 10;
        }

        return sum == originalNumber;
    }
}
