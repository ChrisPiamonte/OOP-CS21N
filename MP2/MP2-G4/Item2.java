import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item2 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of terms (n): ");
        int intFibonacci = Integer.parseInt(reader.readLine());

        int intA = 0, intB = 1, intSum = 0;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i <= intFibonacci; i++){
            System.out.print(intA + " ");
            intSum += intA;
            int intAdd = intA + intB;
            intA = intB;
            intB = intAdd;
        }
        System.out.println("\nSum of sequence = " + intSum);
    }
}