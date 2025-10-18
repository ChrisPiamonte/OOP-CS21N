// 10. Count Digits and Find Largest Digit
// Write a program that counts how many digits a number has and also displays the largest digit in
// the number.

import java.util.*;

public class Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        int largeDigit = 0;

        if(num == 0){
            count = 1;
            largeDigit = 0;
        } else {
            while (num > 0) {
                int digit = num % 10;
                count++;
                if (digit > largeDigit){
                    largeDigit = digit;
                }
                num = num/10;
            }
        }

		System.out.println("");
        System.out.println("Number of digits: " + count);
        System.out.println("Largest digit: " + largeDigit);
        
        scanner.close();
    }
}