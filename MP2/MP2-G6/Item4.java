import java.util.Scanner;

//Armstrong numbers in a range
public class Item4 {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the start of the range: ");
            start = sc.nextInt();
            System.out.print("Enter the end of the range: ");
            end = sc.nextInt();
        sc.close();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int number = start; number <= end; number++) {
            if (armstrongCheck(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean armstrongCheck(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
