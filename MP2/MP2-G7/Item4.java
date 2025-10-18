// 4. Armstrong Numbers in a Range
// Ask the user for a range of numbers and display all Armstrong Numbers within that range. For
// example, between 100 and 500, the Armstrong numbers are 153, 370, 371, 407.

import java.util.*;

public class Item4 {
	public static void main(String[] args) {
		Scanner sean = new Scanner(System.in);

		System.out.println("Armstrong Numbers in a Range ");
		System.out.print("Enter the minimum of range: ");
		int lower = sean.nextInt();
		System.out.print("Enter the maximum of range: ");
		int upper = sean.nextInt();

        System.out.println("");

		System.out.print("Armstrong numbers between " + lower + " and " + upper + ": ");
		for (int i = lower; i <= upper; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		sean.close();
	}

	private static boolean isArmstrong(int num) {
		int original = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		return sum == original;
	}
}
