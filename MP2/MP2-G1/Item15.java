import java.util.Scanner;
import java.util.Arrays;

public class Item15 {
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

        // Sort in ascending order
        int[] asc = arr.clone();
        Arrays.sort(asc);

        // Sort in descending order
        int[] desc = arr.clone();
        Arrays.sort(desc);

        // Reverse the sorted array for descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = desc[i];
            desc[i] = desc[n - i - 1];
            desc[n - i - 1] = temp;
        }

        // Display results
        System.out.print("\nAscending order: ");
        for (int num : asc)
            System.out.print(num + " ");

        System.out.print("\nDescending order: ");
        for (int num : desc)
            System.out.print(num + " ");

        System.out.println();
        sc.close();
    }
}
