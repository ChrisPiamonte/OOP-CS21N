import java.util.Scanner;
//Factorial of Multiple Numbers
public class Item1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Please enter the number of elements: ");
        int inputSize = scanner.nextInt();

        // Create arrays
        long[] numbers = new long[inputSize];
        long[] factorials = new long[inputSize];
        // Input numbers and compute factorials
        for (int i = 0; i < inputSize; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextLong();

            long factorial = 1;
            for (long j = 1; j <= numbers[i]; j++) {
                factorial *= j;
            }

            factorials[i] = factorial;
        }

        // Display results
        System.out.println("\nThese are the factorials of the numbers given:");
        for (int i = 0; i < inputSize; i++) {
            System.out.println(numbers[i] + "! = " + factorials[i]);
        }

        scanner.close();
    }
}
