// 2. Fibonacci Sequence with Sum
// Create a program that generates the first n terms of the Fibonacci sequence and also displays
// the sum of all generated terms. For example, if n = 8, display both the sequence and the total
// sum.

import java.util.Scanner;

public class Item2{

    public static void main(String[] args) {

        //1. Prompt user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int first = 0, second = 1, next;
        int sum = first + second;

        System.out.println("");
        System.out.print("Fibonacci Sequence: " + first + ", " + second);

        //2. Generate Fibonacci sequence and calculate sum
        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(", " + next);
            sum += next;
            first = second;
            second = next;
        }
        
        //3. Display sum of terms
        System.out.println("\nSum of terms: " + sum);
    }
}