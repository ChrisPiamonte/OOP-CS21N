import java.util.Scanner;

public class Item14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        if (n < 2) {
            System.out.println("Need at least 2 numbers.");
            sc.close();
            return;
        }

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Call Bubble Sort
        bubbleSort(numbers);

        // Output
        System.out.println("Second smallest: " + numbers[1]);
        System.out.println("Second largest: " + numbers[n - 2]);

        sc.close();
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}