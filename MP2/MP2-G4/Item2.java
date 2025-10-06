import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item2 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Read user input

        //Ask the user to input how many terms of the Fibonacci sequence to display
        System.out.print("Enter number of terms (n): ");
        int intFibonacci = Integer.parseInt(reader.readLine());

        //Initialize the first two numbers of the Fibonacci sequence and the sum
        int intA = 0, intB = 1, intSum = 0;

        //Display Fibonacci output
        System.out.print("Fibonacci Sequence: ");

        //Loop to generate Fibonacci sequence
        for (int i = 0; i <= intFibonacci; i++){
            System.out.print(intA + " ");//Print the current Fibonacci number
            intSum += intA;//Add current number to total sum

            //Compute the next term of the sequence
            int intAdd = intA + intB;
            intA = intB;//Second term becomes first term
            intB = intAdd;//New term becomes second term
        }
        //Display the sum of all the Fibonacci terms shown
        System.out.println("\nSum of sequence = " + intSum);
    }

}
