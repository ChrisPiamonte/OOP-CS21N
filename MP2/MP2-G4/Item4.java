import java.util.Scanner;

public class Item4 {

    // Method to find and print Armstrong numbers in a given range
    public static void armstrongNumbers (int intMin, int intMax) {
        // Loop through each number in the range
        for (int i = intMin; i <= intMax; i++) {
            String intDigits = Integer.toString(i); // Convert number to string to access digits
            int intDigitsCount = intDigits.length(); // Count the number of digits
            int intSum = 0; // Initialize sum of powered digits

            // Loop through each digit
            for (int j = 0; j < intDigitsCount; j++) {
                int intDigit = Character.getNumericValue(intDigits.charAt(j)); // Get digit as int
                intSum += Math.pow(intDigit, intDigitsCount); // Add digit raised to the power of digit count
            }

            // Check if the sum equals the original number (Armstrong condition)
            if (intSum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
        return;
    }

    public static void main(String[] args) {
        int intMin = 0;
        int intMax = 0;
        Scanner input = new Scanner(System.in);

        // Get minimum range from user
        System.out.println("Please enter the minimum range: ");
        intMin = input.nextInt();

        // Get maximum range from user
        System.out.println("Please enter the maximum range: ");
        intMax = input.nextInt();

        // Print header and call the method to find Armstrong numbers
        System.out.println("Armstrong numbers between " + intMin + " and " + intMax + " are: \n");
        armstrongNumbers(intMin, intMax);
    }

}
