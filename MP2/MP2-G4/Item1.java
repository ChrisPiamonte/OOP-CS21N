import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item1{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Read user input

        //Ask the user for input
        System.out.print("Enter how many numbers to factor: ");
        int intCount = Integer.parseInt(reader.readLine());

        //Array declaration to store numbers and factorials
        int[] intNumbers = new int[intCount];
        long[] longFactorials = new long[intCount];

        //Loop to get numbers from the user
        for (int i = 0; i < intCount; i++){
            System.out.print("Enter Number " + (i + 1) + ": ");
            intNumbers[i] = Integer.parseInt(reader.readLine());
        }

        //Loop to get the factorial of each number
        for (int i = 0; i < intCount; i++){
            long fact = 1;
            for (int j = 1; j <= intNumbers[i]; j++){
                fact *= j;
            }
            longFactorials[i] = fact;//Store the calculated factorial
        }
        //Display the factorial result
        System.out.println("\nFactorials:");
        for (int i = 0; i < intCount; i++){
            System.out.println(intNumbers[i] + "! = " + longFactorials[i]);
        }
    }
}

