// 3. Prime Number in a Range
// Write a program that accepts two numbers as a range and prints all prime numbers within that
// range. Also, display how many prime numbers were found.

import java.util.Scanner;

public class Item3{
    public static void main(String[] args) {

        //1. Prompt user for range start and end
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();
        int count = 0;

        System.out.println("");
        System.out.println("Prime numbers between " +start+ " and " +end+ ":");
        
        //2. Find and print prime numbers in the range using for loop
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num+ " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers found: " +count);
        sc.close();
    }

    //3. check if number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}