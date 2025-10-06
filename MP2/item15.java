import java.util.Scanner;
import java.util.Arrays;

public class item15{
    public static void main (String[] args){
          // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("enter the number of elements (n):");
        int n = scanner.nextInt();
        // Declare and initialize an integer array of size n
        int Arr[] = new int[n];

        // Read the elements from the user
        System.out.println("enter " + n + " elements:");

        // Loop to read n integers and store them in the array
        for(int i = 0; i < n; i++){ 
            Arr[i] = scanner.nextInt();
        }
         // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(Arr);

         // Print the array sorted in ascending order
        System.out.println("Array sorted in ascending order:");
        System.out.println(Arrays.toString(Arr));
        // Declare and initialize a new array for descending order
        int[] DescArr = new int[n];

        // Loop to copy elements from the sorted array in reverse order to create descending sort
        for(int i = 0; i < n; i++){
        DescArr[i] = Arr[n - 1 - i];
    }
        // Print the array sorted in descending order
        System.out.println("Array sorted in descending order:");
        System.out.println(Arrays.toString(DescArr));

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}