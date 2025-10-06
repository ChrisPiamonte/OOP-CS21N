import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Simple bubble sort to arrange numbers
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int secondSmallest = arr[1];
        int secondLargest = arr[n - 2];

        System.out.println("Second smallest: " + secondSmallest);
        System.out.println("Second largest: " + secondLargest);

        sc.close();
    }
}