import java.util.Scanner;
import java.util.Arrays;

public class Item14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intArraySize; // size of the array

        System.out.printf("Enter the Number of Elements: "); // prompt user to enter a number
        intArraySize = scanner.nextInt();

        int[] intArray = new int[intArraySize];

        for (int i = 0; i < intArraySize; i++) { // loop to get user input
            System.out.printf("Element %d: ", i + 1);
            intArray[i] = scanner.nextInt();
        }
        Arrays.sort(intArray); // sorting the array in ascending order

        System.out.println("Second Largest: " + intArray[intArraySize - 2]); // accessing the second largest element
        System.out.println("Second Smallest: " + intArray[1]); // accessing the second smallest element
        scanner.close();
    }
}
