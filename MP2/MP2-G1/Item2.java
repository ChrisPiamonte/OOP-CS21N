import java.util.Arrays;
import java.util.Scanner;

/* Item 2. Fibonacci Sequence With Sum */

public class Item2 { 
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        
        int intFiboSize = 0;
        
        do {
            // Request user for n terms to generate
            System.out.println("Input how much terms of the Fibonacci Sequence to generate: ");
            intFiboSize = objScanner.nextInt(); 

            // Repeat if input is invalid
            if (intFiboSize > 44) {
                System.out.println("Program can only handle terms from 0 to 44.");
            } else if (intFiboSize < 0) {
                System.out.println("Negative integers are invalid.");
            }
        } while (intFiboSize > 45 || intFiboSize < 0);

        objScanner.close(); // Close scanner

        // Initialize array to hold terms
        int[] arrFibonacci = new int[intFiboSize];
        int intFiboSum = 0;

        // Generate n terms of the Fibonacci Sequence
        for (int i = 0; i < intFiboSize; i++) {
            if (i > 1) { // Assign subsequent terms as the sum of their two previous term
                arrFibonacci[i] = arrFibonacci[i - 2] + arrFibonacci[i - 1];
            } else { // Assign default terms by definition
                arrFibonacci[i] = 1;
            }
            intFiboSum += arrFibonacci[i]; // Add to total sum of the sequence
        }
        
        // Display results
        System.out.println("\nFirst " + intFiboSize + " terms of the Fibonacci Sequence: " + Arrays.toString(arrFibonacci));
        System.out.println("The Sum: " + intFiboSum);
    }
}
