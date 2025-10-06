/*
 * Sum of Digits Until Single Digit
 *Create a program that accepts a number and repeatedly finds the sum of its digits until the result
 *is a single digit. For example, 9875 → 29 → 11 → 2.
 */
import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        int num, sum; //stores the number, each digit, and the sum

        Scanner sc = new Scanner(System.in);

        //User input for the number
        System.out.println("Enter Number: ");
        num = sc.nextInt();

        System.out.print(num); // print the original number

        //loops for each digit of the number
        while (num >= 10) {
            sum = 0;
            while (num > 0) {
                sum += num % 10;  // add last digit
                num /= 10;        // remove last digit
            }
            num = sum; // replace num with the sum of digits
            System.out.print(" -> " + num); // prints the result
        }

        sc.close();
    }
}
