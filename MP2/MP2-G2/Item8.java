import java.util.*;

// Java program to compute the GCD of a set of numbers
public class Item8{
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for the number of integers
        System.out.print("Enter the number of integers: ");
        int intCount = inputScanner.nextInt();
        int[] arrNumbers = new int[intCount];
        
        // Read integers from user
        System.out.println("Enter " + intCount + " integers:");
        for (int i = 0; i < intCount; i++) {
            arrNumbers[i] = inputScanner.nextInt();
        }
        
        // Compute GCD of the array by comparing each element in the array
        int gcdResult = arrNumbers[0];
        for (int i = 1; i < intCount; i++) {
            gcdResult = computeGCD(gcdResult, arrNumbers[i]);
        }
        
        // Print the GCD result
        System.out.println("The GCD of the given numbers is: " + gcdResult);
        inputScanner.close();
    }

    // Method to compute GCD of two numbers
    public static int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
