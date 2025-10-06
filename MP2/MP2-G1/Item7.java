import java.util.Scanner;

public class Item7 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int intInputNum = objScanner.nextInt();

        int intReversed = 0, intRemainder = 0, intTemp = intInputNum;

        while (intTemp != 0) {
            intRemainder = intTemp % 10;
            intReversed = intReversed * 10 + intRemainder;
            intTemp /= 10;
        }

        System.out.println("Original Number: " + intInputNum);
        System.out.println("Reversed Number: " + intReversed);
        if (intInputNum == intReversed) {
            System.out.println(intInputNum + " is a palindrome number.");
        } else {
            System.out.println(intInputNum + " is NOT a palindrome number.");
        }


        objScanner.close();
    }
}