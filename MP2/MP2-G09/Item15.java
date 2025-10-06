/**
 * Sorting an Array in Ascending and Descending Order
 *
 * Create a program that accepts n numbers, stores them in an array, and sorts them in both
 * ascending and descending order. Display both results.
 */


import java.util.Scanner;


public class Item15
{
    /**
     * Sorts the array in ascending order using a simple bubble sort.
     *
     * @param numbers the array of double values
     * @param count the number of elements in the array
     */
    public static void sortAscending(double[] numbers, int count)
    {
        double temp;


        // Bubble sort for ascending order
        for (int i = 0; i < count - 1; i++)
        {
            for (int j = 0; j < count - i - 1; j++)
            {
                if (numbers[j] > numbers[j + 1])
                {
                    // Swap values
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


    /**
     * Sorts the array in descending order using a simple bubble sort.
     *
     * @param numbers the array of double values
     * @param count the number of elements in the array
     */
    public static void sortDescending(double[] numbers, int count)
    {
        double temp;


        // Bubble sort for descending order
        for (int i = 0; i < count - 1; i++)
        {
            for (int j = 0; j < count - i - 1; j++)
            {
                if (numbers[j] < numbers[j + 1])
                {
                    // Swap values
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


    /**
     * The main method that accepts user input, displays the entered values,
     * and shows both ascending and descending sorted results.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        int intInputCount = 0;
        double[] doubleArrItems;


        // Ask the user for the number of inputs
        do
        {
            System.out.print("How many numbers will you enter? ");
            intInputCount = scanner.nextInt();


            if (intInputCount <= 0)
            {
                System.out.println("\nInvalid. Please input a valid positive integer.");
            }
        }
        while (intInputCount <= 0);


        // Initialize array
        doubleArrItems = new double[intInputCount];


        // Get user input for each number
        for (int intIndexCount = 0; intIndexCount < intInputCount; intIndexCount++)
        {
            System.out.print("Enter number " + (intIndexCount + 1) + ": ");
            doubleArrItems[intIndexCount] = scanner.nextDouble();
        }


        // Create separate arrays to store ascending and descending results
        double[] ascendingArr = doubleArrItems.clone();
        double[] descendingArr = doubleArrItems.clone();


        // Sort arrays
        sortAscending(ascendingArr, intInputCount);
        sortDescending(descendingArr, intInputCount);


        // Display original (unsorted) inputs
        System.out.println("\nNumbers entered (Original Order):");
        for (int i = 0; i < intInputCount; i++)
        {
            System.out.print(doubleArrItems[i] + " ");
        }


        // Display ascending order
        System.out.println("\n\nNumbers in Ascending Order:");
        for (int i = 0; i < intInputCount; i++)
        {
            System.out.print(ascendingArr[i] + " ");
        }


        // Display descending order
        System.out.println("\n\nNumbers in Descending Order:");
        for (int i = 0; i < intInputCount; i++)
        {
            System.out.print(descendingArr[i] + " ");
        }


        System.out.println(); // Blank line for cleaner output
        scanner.close();
    }
}

