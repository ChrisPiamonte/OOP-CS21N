import java.util.Scanner;

public class item6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        // Repeat until number becomes a single digit
        int sum;
        while (num >= 10) {
            sum = 0;

            // Add all digits of the number
            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10; 
            }

            System.out.println("Sum of digits: " + sum);
            num = sum;
        }

        System.out.println("Final single digit: " + num);
    }
}