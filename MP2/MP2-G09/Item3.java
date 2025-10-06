import java.util.Scanner;


public class Item3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int start, end, count = 0;


        System.out.println("[ Prime Numbers Within a Range ]\n");
        System.out.print("Enter the starting number: ");
        start = sc.nextInt(); // Inputting the starting number for the range


        System.out.print("Enter the ending number: ");
        end = sc.nextInt(); // Inputting the ending number for the range


        System.out.println("\nPrime numbers between " + start + " and " + end + ":");


        // Loop through the range
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }


        System.out.println("\n\nTotal prime numbers found: " + count); // Printing the result
        sc.close(); // Closing the scanner
    }


    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

