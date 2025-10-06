/**
 * Array Maximum, Minimum, and Average
 *
 * Ask the user to enter n numbers, store them in an Array,
 * and determine the largest number, smallest number, and the average of all numbers.
 */
import java.util.Scanner;


public class Item13
{
    /**
    * Finds the smallest number in the given array.
    *
    * @param numbers the array of double values
    * @param count the number of elements in the array
    * @return the smallest number in the array
    */
    public static double findSmallest(double[] numbers, int count)
    {
        double doubleSmallest = numbers[0]; // Assume first element is smallest


        // Compare each element with the next one
        for (int i = 1; i < count; i++)
        {
            if (numbers[i] < doubleSmallest)
            {
                doubleSmallest = numbers[i]; // Update smallest if smaller number found
            }
        }
        return doubleSmallest; // Update smallest if smaller number found
    }


    /**
    * Finds the largest number in the given array.
    *
    * @param numbers the array of double values
    * @param count the number of elements in the array
    * @return the largest number in the array
    */
    public static double findLargest(double[] numbers, int count)
    {
        double doubleLargest = numbers[0]; // Assume first element is largest


        // Compare each element with the next one
        for (int i = 1; i < count; i++)
        {
            if (numbers[i] > doubleLargest)
            {
                doubleLargest = numbers[i]; // Update largest if larger number found
            }
        }
        return doubleLargest; // Return largest value
    }


    /**
    * Computes the average of all numbers in the given array.
    *
    * @param numbers the array of double values
    * @param count the number of elements in the array
    * @return the average value
    */
    public static double computeAverage(double[] numbers, int count)
    {
        double doubleSumArr = 0; // Sum of all array elements
        double doubleResult = 0; // Resulting average


        // Sum all numbers in the array
        for (int i = 0; i < count; i++)
        {
            doubleSumArr += numbers[i];
        }


        // Compute the average
        doubleResult = (doubleSumArr / count);


        return doubleResult; // Return computed average
    }


    /**
    * The main method handles user input, stores values in an array,
    * and displays the smallest, largest, and average of the entered numbers.
    */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        int intInputCount = 0; // Number of values to be entered
        double[] doubleArrItems; // Array to store input numbers


        // Validate user input for positive number count
        do
        {
            System.out.print("\nHow many numbers will you enter? ");


            intInputCount = scanner.nextInt();


            if (intInputCount <= 0)
            {
                System.out.println("\nInvalid. Please input a valid positive integer.");
            }
        }
        while(intInputCount <= 0);


        // Initialize array based on user input count
        doubleArrItems = new double[intInputCount];


        // Collect user inputs and store in array
        for (int intIndexCount = 0; intIndexCount < intInputCount; intIndexCount++)
        {
            System.out.print("Enter number " + (intIndexCount + 1) + ": ");
            doubleArrItems[intIndexCount] = scanner.nextDouble();
        }


        // Call methods to find smallest, largest, and average values
        double doubleSmallest = findSmallest(doubleArrItems, intInputCount);
        double doubleLargest = findLargest(doubleArrItems, intInputCount);
        double doubleAverage = computeAverage(doubleArrItems, intInputCount);


        // Display all entered numbers
        System.out.println("\nNumbers entered: ");
        for (int i = 0; i < intInputCount; i++)
        {
            System.out.println(doubleArrItems[i]);
        }


        // Display results
        System.out.println("\nSmallest number: " + doubleSmallest);
        System.out.println("Largest number: " + doubleLargest);
        System.out.println("Average of all numbers: " + doubleAverage + "\n");


        scanner.close(); // Close scanner to prevent memory leak
    }
}
