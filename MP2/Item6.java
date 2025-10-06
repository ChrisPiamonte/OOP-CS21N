package MP2;

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();  

        // Repeat until only one digit remains
        while (num >= 10) {
            long sum = 0;
            long temp = num;
            
            // Add each digit
            while (temp > 0) {
                sum += temp % 10; //get last digit
                temp /= 10; 	  // remove last digit
            }

            num = sum; //replace number with the sum
            System.out.println("Current sum: " + num);
        }

        System.out.println("Single digit result: " + num);
        sc.close();
    }
}
