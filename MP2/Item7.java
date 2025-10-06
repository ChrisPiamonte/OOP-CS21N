import java.util.*;

public class Item7 {

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int temp = 0;
        int reversed = 0;
        int counter = num;

        while (counter != 0) {
            temp = counter % 10;
            counter /= 10;
            reversed = reversed * 10 + temp;   
        }

        System.out.println("Reversed number: " + reversed);

        return num == reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("Enter a number to be reversed and palindrome checked: ");
            num = scanner.nextInt();

            if (num < 1) {
                System.out.println("Please enter a number greater than 0.");
            }
        } while (num < 1);
        scanner.close();

        if (isPalindrome(num)) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
