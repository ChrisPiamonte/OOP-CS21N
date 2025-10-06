import java.util.*;

// Java program to compute the maximum, minimum, and average of a set of numbers
public class Item13{
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Array Maximum, Minimum, and Average");
        
        // Prompt user for the number of integers
        System.out.print("Enter the number of integers: ");
        int count = inputScanner.nextInt();
        int[] arrNumbers = new int[count];

        // Read integers from user
        System.out.println("Enter " + count + " integers:");
        for(int i = 0; i < count; i++){
            arrNumbers[i] = inputScanner.nextInt();
        }

        // Initialize max, min, and sum with the first element of the array
        int intMax = arrNumbers[0];
        int intMin = arrNumbers[0];
        int intSum = arrNumbers[0];

        // Compute max, min, and sum by comparing each element in the array
        for(int i = 1; i < count; i++){
            if(arrNumbers[i] > intMax){
                intMax = arrNumbers[i];
            }
            if(arrNumbers[i] < intMin){
                intMin = arrNumbers[i];
            }
            intSum += arrNumbers[i];
        }

        int intAverage = intSum / count;

        // Print the results
        System.out.println("The maximum value is: " + intMax);
        System.out.println("The minimum value is: " + intMin);
        System.out.println("The average value is: " + intAverage);

        inputScanner.close();
    }
}