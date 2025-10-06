import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Item3 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter start of range: ");
        int intStart = Integer.parseInt(reader.readLine());

        System.out.print("Enter end of range: ");
        int intEnd = Integer.parseInt(reader.readLine());

        int intTotal = 0;

        System.out.print("Prime numbers between " + intStart + " and " + intEnd + ": ");

        for (int i = intStart; i <= intEnd; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
                intTotal++;
            }
        }
        System.out.print("\nThe total of prime number found: " + intTotal);
    }
    static boolean isPrime(int intNumber){
        if (intNumber <= 1) return false;
        for (int i = 2; i <= Math.sqrt(intNumber); i++){
            if (intNumber % i == 0)
            return false;
        }
        return true;
    }
}