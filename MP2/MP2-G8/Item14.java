import java.util.*;

public class Item14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        
        //Ask user input for the size of array
        System.out.print("Enter the number of elements: ");
        int intNum = scan.nextInt();  

        // Check if the array has at least two elements
        if (intNum < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] intArray = new int[intNum];  

        // Input array elements
        System.out.println("Enter " + intNum + " elements:");
        for (int i = 0; i < intNum; i++) {
            intArray[i] = scan.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(intArray);

        //Second smallest and second largest
        int intSecondSmallest = intArray[1];
        int intSecondLargest = intArray[intNum - 2];

        //Print output
        System.out.println("Second Smallest Number: " + intSecondSmallest);
        System.out.println("Second Largest Number: " + intSecondLargest);

        scan.close(); 
    }
}