import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item1{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter how many numbers to factor: ");
        int count = Integer.parseInt(reader.readLine());

        int[] intNumbers = new int[count];
        long[] longFactorials = new long[count];

        for (int i = 0; i < count; i++){
            System.out.print("Enter Number " + (i + 1) + ": ");
            intNumbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < count; i++){
            long fact = 1;
            for (int j = 1; j <= intNumbers[i]; j++){
                fact *= j;
            }
            longFactorials[i] = fact;
        }
        System.out.println("\nFactorials:");
        for (int i = 0; i < count; i++){
            System.out.println(intNumbers[i] + "! = " + longFactorials[i]);
        }
    }
}
