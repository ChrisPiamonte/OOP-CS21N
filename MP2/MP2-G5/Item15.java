import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Item15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intArraySize; // size of the array

        System.out.printf("Enter the number of elements: ");
        intArraySize = scanner.nextInt();

        int[] intArray = new int[intArraySize]; // array for ascending order.

        for (int i = 0; i < intArraySize; i++) { // loop to get user input
            System.out.printf("Element %d: ", i + 1);
            intArray[i] = scanner.nextInt();
        }

        Arrays.sort(intArray); // sorting in ascending order.

        Integer[] intArray2 = new Integer[intArraySize]; // copying array for descending order.
        for (int i = 0; i < intArraySize; i++) {
            intArray2[i] = intArray[i];
        }

        Arrays.sort(intArray2, Collections.reverseOrder()); // sorting the array in descending order.

        System.out.println("Ascending Order: " + Arrays.toString(intArray));
        System.out.println("Descending Order: " + Arrays.toString(intArray2));
        scanner.close();
    }
}
