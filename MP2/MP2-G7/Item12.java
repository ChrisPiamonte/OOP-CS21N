// 12. Sum of Even and Odd Numbers with Difference
// Write a program that accepts a range of numbers, computes separately the sum of even numbers
// and odd numbers, and also finds the difference between the two sums.

import java.util.*;

public class Item12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int start = 0;
        int end = 0;

        while (true){
            System.out.print("Enter starting number: ");
            start = scanner.nextInt();

            System.out.print("Enter the end number: ");
            end = scanner.nextInt();

            if (start > end){
                System.out.println("Invalid range! Try again");
            } else {
                break;
            }
        }

		System.out.println("");
        int sumEven = 0; 
        int sumOdd = 0;

        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        int diff = Math.abs(sumEven - sumOdd);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Difference between two sums: " + diff);
        scanner.close();
    }
}