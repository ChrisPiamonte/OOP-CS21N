import java.util.Arrays;
import java.util.Scanner;

public class Item2 { // Fibonacci Sequence Problem
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        int intFiboSize = 0;
        
        do {
            System.out.println("Input how much terms of the Fibonacci Sequence to generate: ");
            intFiboSize = objScanner.nextInt(); 

            if (intFiboSize > 44) {
                System.out.println("Program can only handle terms from 0 to 44.");
            } else if (intFiboSize < 0) {
                System.out.println("Negative integers are invalid.");
            }
        } while (intFiboSize > 45 || intFiboSize < 0);

        int[] arrFibonacci = new int[intFiboSize];
        int intFiboSum = 0;

        for (int i = 0; i < intFiboSize; i++) {
            if (i > 1) { 
                arrFibonacci[i] = arrFibonacci[i - 2] + arrFibonacci[i - 1];
            } else { // first assign default terms by definition
                arrFibonacci[i] = 1;
            }
            intFiboSum += arrFibonacci[i];
        }
        
        System.out.println("\nFirst " + intFiboSize + " terms of the Fibonacci Sequence: " + Arrays.toString(arrFibonacci));
        System.out.println("The Sum: " + intFiboSum);

        objScanner.close();
    }
}
