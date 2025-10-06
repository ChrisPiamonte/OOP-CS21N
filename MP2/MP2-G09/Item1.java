import java.util.Scanner; // Importing Scanner

public class Item1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a scanner object


        // Initializing the variables
        int size;
        int iteration;
        int array[];


        System.out.println("\n[ Factorial Of Multiple Numbers ]\n");
        System.out.print("Input the size of the array: ");
        size = sc.nextInt();
        array = new int[size]; // Setting the size of the array


        // Input values for the array
        for (iteration = 0; iteration < size; iteration++) {
            System.out.print("Enter number " + (iteration + 1) + ": ");
            array[iteration] = sc.nextInt();
        }


        // Display the entered array
        System.out.print("Your array: [");
        for (iteration = 0; iteration < size; iteration++) {
            System.out.print(array[iteration]);
            if (iteration < size - 1) System.out.print(", ");
        }
        System.out.println("]");


        // Compute and display factorials
        System.out.println("\nThe factorials of your array:");
        for (iteration = 0; iteration < size; iteration++) {
            int givenNumber = array[iteration];
            long factorial = 1;


            for (int j = 1; j <= givenNumber; j++) {
                factorial *= j;
            }


            System.out.println(givenNumber + "! = " + factorial);
        }


        sc.close(); // Close the scanner
    }
}
