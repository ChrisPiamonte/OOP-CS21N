import java.util.Arrays;
import java.util.Scanner;

public class item14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Find second smallest (arr[1] if distinct, else find next distinct)
        int secondSmallest = arr[1];
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }
        
        // Find second largest (arr[n-2] if distinct, else find next distinct)
        int secondLargest = arr[n - 2];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        
        System.out.println("Second smallest number: " + secondSmallest);
        System.out.println("Second largest number: " + secondLargest);
        
        scanner.close();
    }
}
