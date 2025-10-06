import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item3 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Reads user input

        //Ask the user to input the start of the range
        System.out.print("Enter start of range: ");
        int intStart = Integer.parseInt(reader.readLine());

        //Ask the user to input the end of the range
        System.out.print("Enter end of range: ");
        int intEnd = Integer.parseInt(reader.readLine());

        int intTotal = 0;//To count how many prime numbers are found

        //Display for output
        System.out.print("Prime numbers between " + intStart + " and " + intEnd + ": ");

        //Loop through all the numbers in the given range
        for (int i = intStart; i <= intEnd; i++){
            //To check if the current number is prime
            if (isPrime(i)){
                System.out.print(i + " ");
                intTotal++;
            }
        }
        //Display the total prime numbers found
        System.out.print("\nThe total of prime number found: " + intTotal);
    }
    //To check if a number is prime
    static boolean isPrime(int intNumber){
        if (intNumber <= 1) return false;
        for (int i = 2; i <= Math.sqrt(intNumber); i++){
            if (intNumber % i == 0)
            return false;//Not a prime number if divisible by another number
        }
        return true;//Prime if no divisors were found
    }

}
