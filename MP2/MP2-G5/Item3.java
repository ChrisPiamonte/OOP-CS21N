import java.util.Scanner;

public class Item3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two number: ");
        int intStart = scanner.nextInt();

        System.out.print("Prime numbers: ");
        int intEnd = scanner.nextInt();

        int intCount = 0;

        for (int intNum = intStart; intNum <= intEnd; intNum++) {
            if (isPrime(intNum)) {
                System.out.print(intNum + " ");
                intCount++;
            }
        }

        System.out.println("\nThere's a " + intCount + " total Primes number");
        scanner.close();
    }

    public static boolean isPrime(int intNum) {
        if (intNum < 2) return false;
        for (int i = 2; i <= intNum / 2; i++) {
            if (intNum % i == 0) return false;
        }
        return true;
    }
}
