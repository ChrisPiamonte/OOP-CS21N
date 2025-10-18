// 5. Palindrome Number Checker (Multiple Inputs)
// Write a program that asks the user to input multiple numbers, checks which ones are Palindrome
// Numbers, and displays all palindrome numbers found.

import java.util.*;

public class Item5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers will you input: ");
		int n = scanner.nextInt();
	    int[] palindromes = new int[n];
	    int palindromeCount = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			int num = scanner.nextInt();
			if (isPalindrome(num)) {
				palindromes[palindromeCount] = num;
				palindromeCount++;
			}
		}

        System.out.println("");
		System.out.print("Palindrome numbers: ");
		for (int i = 0; i < palindromeCount; i++) {
			System.out.print(palindromes[i]);
			if (i < palindromeCount - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		scanner.close();
	}

	private static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
}
