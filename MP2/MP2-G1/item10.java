import java.util.Scanner;

public class item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        int temp = num;

        // Repeat while number still has digits
        int count = 0, largest = 0, digit;
        while (num > 0) {
            digit = num % 10; 
            count++;

            if (digit > largest) {
                largest = digit;
            }

            num = num / 10;
        }

        // check how many digits
        if (count == 1) {
            System.out.println("The number " + temp + " has " + count + " digit.");
        } else {
            System.out.println("The number " + temp + " has " + count + " digits.");
        }

        System.out.println("The largest digit is: " + largest);
    }
}
