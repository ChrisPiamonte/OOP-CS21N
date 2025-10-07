import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int intOriginalNumber = scanner.nextInt();

        int intReversedNumber = 0;
        int intTempNumber = intOriginalNumber;

        while (intTempNumber > 0) {
            int intDigit = intTempNumber % 10;
            intReversedNumber = intReversedNumber * 10 + intDigit;
            intTempNumber = intTempNumber / 10;
        }

        System.out.println("Reversed number: " + intReversedNumber);

        if (intOriginalNumber == intReversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }
}
