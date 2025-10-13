import java.util.Scanner;   

// Palindrome Number Checker (Multiple Inputs)
public class Item5 {
    public static void main(String[] args) {
        int[] numbers;

        Scanner sc = new Scanner(System.in);
            System.out.print("How many numbers to input? (type 'exit' to quit): ");
            int count = sc.nextInt();
            numbers = new int[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
        sc.close();

        System.out.println("Checking for palindromes...");
        System.out.print("Palindrome numbers found: ");
        for (int number : numbers) {
            if (palindromeCheck(number)) {
                System.out.print(number + ", ");
            } 
        }
        
    }

    public static boolean palindromeCheck (int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
