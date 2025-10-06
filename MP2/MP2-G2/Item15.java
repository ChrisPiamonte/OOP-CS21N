import java.util.*;

public class Item15 {
    public static void main(String[] args) {
        System.out.println("Sorting an Array in Ascending and Descending Order");
        
        // user input intN
        Scanner objScanner = new Scanner(System.in); 
        System.out.print("How many numbers to input: ");
        int intN = objScanner.nextInt();

        // user input numbers in array
        Integer[] arrNumbers = new Integer[intN];
        for (int i = 0; i < intN; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arrNumbers[i] = objScanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arrNumbers));

        // sorting (ascending and descending)
        Arrays.sort(arrNumbers);
        System.out.println("Sorted (ascending) array: " + Arrays.toString(arrNumbers));

        Arrays.sort(arrNumbers, Collections.reverseOrder());
        System.out.println("Sorted (descending) array: " + Arrays.toString(arrNumbers));

        objScanner.close();
    }
}
