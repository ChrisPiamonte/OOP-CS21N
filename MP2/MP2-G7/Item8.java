// 8. GCD of Multiple Numbers
// Write a program that asks the user for an array of numbers and computes the Greatest Common
// Divisor (GCD) of all of them.

import java.util.Scanner;

public class Item8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---GREATEST COMMON DIVISOR---\n");

        System.out.print("Enter the size of your numbers: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        System.out.println("Enter your numbers:");
        for (int index = 0; index < arraySize; index ++){
            System.out.printf("Number %d: ", index + 1);
            array[index] = scanner.nextInt();
        }

        int result = gcdArray(array);

		System.out.println("");
        System.out.println("The GCD of the given numbers are: " + result);

        scanner.close();
    }

    public static int gcd(int first, int second){
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;

        }
        return first;
    }


    public static int gcdArray(int numbers[]){
        int result = numbers[0];

        for (int index = 0; index < numbers.length; index ++){
            result = gcd(result, numbers[index]);
        }
        return result;
    }
}