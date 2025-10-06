import java.util.*;

public class Item3 {
    static boolean isPrime(int intNumber) { // Method to check if a number is prime
        if (intNumber <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= intNumber / 2; i++) {
            if (intNumber % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Prime if no divisor found
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user for the starting and ending range
        System.out.print("Enter starting number: ");
        int intStart = scan.nextInt();

        System.out.print("Enter ending number: ");
        int intEnd = scan.nextInt();

        // Checks if the range is valid (Ending value must be > Starting value)
        while(intEnd < intStart){
            System.out.println("Invalid Range! The ending value must be greater than the starting value.");

            System.out.print("\nEnter starting number: ");
            intStart = scan.nextInt();

            System.out.print("Enter ending number: ");
            intEnd = scan.nextInt();
        }


        int intCountPrimes = 0; // Counter for total primes found

        System.out.println("\nPrime numbers between " + intStart + " and " + intEnd + ":");

        // Loop through the range and check for primes
        for (int i = intStart; i <= intEnd; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                intCountPrimes++;
            }
        }

        // Display total number of primes found
        System.out.println("\nTotal Prime Numbers Found: " + intCountPrimes);

        scan.close();
    }
}