// 6. Sum of Digits Until Single Digit
// Create a program that accepts a number and repeatedly finds the sum of its digits until the result
// is a single digit. For example, 9875 → 29 → 11 → 2.

import java.util.Scanner;

public class Item6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int result = num;

		System.out.println("");

		System.out.print(num);
		while (result >= 10) {
			result = sumOfDigits(result);
			System.out.print(" -> " + result);
		}
		scanner.close();
	}

	private static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
