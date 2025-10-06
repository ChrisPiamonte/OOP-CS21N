import java.util.Scanner;

// Sum of digits until single digit
public class Item6 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        sc.close();

        System.out.print("Process: ");
        int result = addEachDigit(number);
        System.out.println("\nThe single digit sum of " + number + " is: " + result);
    }

    public static int addEachDigit(int number) {
        System.out.print(number); 

        while (number >= 10) {
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.print(" -> " + sum); 
            number = sum;
        }
        return number;
    }
}
