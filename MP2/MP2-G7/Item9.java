// 9. LCM of Multiple Numbers
// Create a program that asks the user for several numbers and computes their Least Common
// Multiple (LCM).

import java.util.Scanner;

public class Item9 {

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

        int result = lcdArray(array);

		System.out.println("");
        System.out.println("The LCM of the given numbers are: " + result);

        scanner.close();
    }

    public static int lcm(int first, int second){
        return (first * second) / gcd(first, second);
    }

    public static int lcdArray(int[] numbers){
        int result = numbers[0];
        for (int index = 1; index < numbers.length; index ++){
            result = lcm(result, numbers[index]);
        }
        return result;
    }


    public static int gcd(int first, int second){
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;

        }
        return first;
    }
}