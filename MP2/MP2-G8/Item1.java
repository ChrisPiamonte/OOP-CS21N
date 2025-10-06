import java.util.*;

public class Item1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask how many numbers the user wants to compute factorials for
        System.out.print("Enter how many numbers you want to compute factorials for: ");
        int intCount = scan.nextInt();

        // Arrays to store the numbers and their factorials
        int[] arrNumbers = new int[intCount];
        long[] arrFactorials = new long[intCount];

        // Input numbers into the array
        for (int i = 0; i < intCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arrNumbers[i] = scan.nextInt();
        }

        // Compute factorial for each number
        for (int i = 0; i < intCount; i++) {
            long lngFactorial = 1;
            for (int j = 1; j <= arrNumbers[i]; j++) {
                lngFactorial *= j;
            }
            arrFactorials[i] = lngFactorial;  // Store result in array
        }

        // Display factorial results
        System.out.println("\nFactorials:");
        for (int i = 0; i < intCount; i++) {
            System.out.println(arrNumbers[i] + "! = " + arrFactorials[i]);
        }

        scan.close();
    }
}