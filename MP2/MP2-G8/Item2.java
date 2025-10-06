import java.util.*;

public class Item2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user how many Fibonacci terms to generate
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int intTerms = scan.nextInt();

        // Array to store Fibonacci numbers
        int[] arrFibonacci = new int[intTerms];
        int intSum = 0; // To store sum of sequence

        // Generate Fibonacci sequence
        for (int i = 0; i < intTerms; i++) {
            if (i == 0) {
                arrFibonacci[i] = 0; // First term
            } else if (i == 1) {
                arrFibonacci[i] = 1; // Second term
            } else {
                arrFibonacci[i] = arrFibonacci[i - 1] + arrFibonacci[i - 2]; // Next terms
            }
            intSum += arrFibonacci[i]; // Add current term to sum
        }

        // Display the Fibonacci sequence
        System.out.print("\nFibonacci Sequence: ");
        for (int i = 0; i < intTerms; i++) {
            System.out.print(arrFibonacci[i] + " ");
        }

        // Display total sum
        System.out.println("\nSum = " + intSum);

        scan.close();
    }
}