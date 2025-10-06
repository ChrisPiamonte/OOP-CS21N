import java.math.BigInteger;
import java.util.*;

public class Item1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger factorial = BigInteger.ONE; // Using BigInt to avoid overflow.
        int size = 0;
        do {
            System.out.print("Pick an array size: ");
            size = scanner.nextInt();
            if (size < 1) {
                System.out.println("Invalid array size. Please input a value greater than 0.");
            }
        } while (size < 1);
        
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            do {
                System.out.print("Enter value " + (i + 1) + " : ");
                arr[i] = scanner.nextInt();
                if (arr[i] < 0) {
                    System.out.println("Please input a non-negative number.");
                }
            } while (arr[i] < 0);
        }
        scanner.close();

        for(int i = 0; i < size; i++) {
            factorial = BigInteger.ONE;
            for(int j = arr[i]; j > 0; j--) {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }
            System.out.println("Value " + (i + 1) + "(" +arr[i] + ")" + " has a factorial of " + factorial);
        }
    }

}