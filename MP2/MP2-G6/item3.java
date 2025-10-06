import java.util.Scanner;
import java.util.ArrayList;

public class Problem3 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startRange = 0;
        int endRange = 0;

        System.out.println("--- Welcome to the Prime Number Range Finder! ---");
        System.out.println("Let's find all the prime numbers between two limits you choose.");
//first number
        while (startRange <= 0) {
            System.out.print("Please enter the starting number (must be greater than 0): ");
            if (scanner.hasNextInt()) {
                startRange = scanner.nextInt();
                if (startRange <= 0) {
                    System.out.println("Oops! The starting number must be positive. Try again.");
                }
            } else {
                System.out.println("That wasn't a valid number. Please try again.");
                scanner.next();
            }
        }
//second num
        while (endRange < startRange) {
            System.out.print("Please enter the ending number (must be greater than or equal to the start): ");
            if (scanner.hasNextInt()) {
                endRange = scanner.nextInt();
                if (endRange < startRange) {
                    System.out.println("The end number must be greater than or equal to the start number. Try again.");
                }
            } else {
                System.out.println("That wasn't a valid number. Please try again.");
                scanner.next();
            }
        }

        System.out.println("\nAnalyzing the numbers you provided");

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = startRange; i <= endRange; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
//result display
      
        if (primeNumbers.isEmpty()) {
            System.out.println("Great news! We searched, but found no prime numbers in that range.");
        } else {
            System.out.println("Success! We found " + primeNumbers.size() + " prime numbers in the range [" + startRange + ", " + endRange + "].");
            System.out.print("The prime numbers are: ");

            for (int i = 0; i < primeNumbers.size(); i++) {
                System.out.print(primeNumbers.get(i));
                if (i < primeNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
     

        scanner.close();
    }
}