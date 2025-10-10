import java.util.Scanner;

public class Item13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        double sum = 0;

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        double average = sum / n;

        System.out.println("\nLargest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.printf("Average: %.2f\n", average);

        sc.close();
    }
}
