import java.util.Scanner;
import java.util.Arrays;

public class Item14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Sort array
        Arrays.sort(arr);

        // Display second smallest and second largest
        System.out.println("\nSecond smallest number: " + arr[1]);
        System.out.println("Second largest number: " + arr[n - 2]);

        sc.close();
    }
}
