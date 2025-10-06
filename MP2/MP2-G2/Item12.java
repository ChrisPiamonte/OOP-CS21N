/*
 *Sum of Even and Odd Numbers with Difference
 *Write a program that accepts a range of numbers, computes separately the sum of even numbers
 *and odd numbers, and also finds the difference between the two sums.
 */
import java.util.Scanner;

public class Item12 {
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
        return true;        //if number is even
        } else return false; //if number is odd
    }

    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0; //stores total of even and odd numbers
        int startNum, endNum;        //range

        Scanner sc = new Scanner(System.in);

        //User input for Start and End Number
        System.out.println("Enter Start Number: ");
        startNum = sc.nextInt();
        System.out.println("Enter End Number: ");
        endNum = sc.nextInt();

        //loop on all number within range
        for (int i=startNum; i<=endNum; i++) {
            if (isEven(i)) {
                evenSum += i; // add even number
            } else {
                oddSum += i;  // add odd number
            }
        }

        int difference = Math.abs(evenSum - oddSum); //Find the difference of evenSum and oddSum

        //Printing of Outputs
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Difference: " + difference);   
        
        sc.close();
    }
}
