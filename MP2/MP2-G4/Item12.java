import java.util.Scanner;

public class Item12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        // Input range
        System.out.println("Enter the range (Start): ");
        int intStart = input.nextInt();  
        
        System.out.println("Enter the range (End): ");
        int intEnd = input.nextInt();    

        int intEvenSum = 0;
        int intOddSum = 0;


        // Loop through the range and calculate sums
        for (int i = intStart; i <= intEnd; i++) {
            if (i % 2 == 0)
                intEvenSum = intEvenSum + i;
            else
                intOddSum = intOddSum + i;  
        }

        // Compute difference
        int difference = intEvenSum - intOddSum;

        // Output results
        System.out.println("Range: " + intStart + " to " + intEnd);
        System.out.println("Sum of even numbers: " + intEvenSum);
        System.out.println("Sum of odd numbers: " + intOddSum);
        System.out.println("Difference (even - odd): " + difference);
    }

}
