import java.util.*;

public class Item15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        //Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int intNum = scan.nextInt();
        
        Integer[] intArray = new Integer[intNum];
        
        //Input elements from the user
        System.out.println("Enter " + intNum + " numbers:");
        for (int i = 0; i < intNum; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            intArray[i] = scan.nextInt();
        }
        
        // Display original array
        System.out.println("\nOriginal array: " + Arrays.toString(intArray));
        
        // Sort array in ascending order
        Arrays.sort(intArray);
        System.out.println("Array in ascending order: " + Arrays.toString(intArray));
        
        // Sort array in descending order
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Array in descending order: " + Arrays.toString(intArray));
        
        scan.close();
    }
}   