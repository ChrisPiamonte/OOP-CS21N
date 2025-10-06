import java.util.*;

public class Item3 {
    // Prime number checker method
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = 0;
        int upper = 0;

        System.out.println("Select a range of number (Ex. 1 to 10)");
        do {
            System.out.print("Lower limit: ");
            lower = scanner.nextInt();

            if (lower < 0) {
                System.out.println("Enter a number greater than 0.");
            }
        } while (lower < 0);

        do {
            System.out.print("Upper limit: ");
            upper = scanner.nextInt();

            if (upper < 0) {
                System.out.println("Enter a number greater than 0.");
            }
        } while (upper < 0);
        scanner.close();

        int primeCounter = 0; 


        for(int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                primeCounter++;
            }
        }

        int[] arr = new int[primeCounter];
        int index = 0;

        for(int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                arr[index++] = i;
            }
        }

        System.out.print("Between the range (" + lower + ", " + upper + "), a total of " + primeCounter + " Prime numbers were found");
        if (primeCounter > 0) {
            System.out.print(", namely (");
             for(int i = 0; i < primeCounter; i++) {
                System.out.print(arr[i]);
                if (i < primeCounter - 1) {
                    System.out.print(", ");
                } else {
                System.out.print(").");
                }
            }
        }
    }
}
