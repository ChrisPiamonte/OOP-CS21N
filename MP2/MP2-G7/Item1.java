// 1. Factorial of Multiple Numbers
// Write a program that asks the user for several numbers (using an array) and calculates the
// factorial of each number using a loop. Display the results for all inputs.

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many entries?: ");
        int n =sc.nextInt();
        int[] numbers = new int[n];

        //1. Prompt user to input numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("");

        //2. Compute factorial using loops
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            long factorial = 1;

            for (int j = 1; j <=num; j++) {
                factorial *= j;
            }

            //3. Display results
            System.out.println("Factorial of " +num+ " = " + factorial);
        }

        sc.close();
    }
}