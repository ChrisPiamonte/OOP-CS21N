import java.util.Scanner;

public class Item9{
    // GCD calculator method
    public static int calculateGCD(int result, int eachNumber){
        while(eachNumber != 0){
            int temp = eachNumber;
            eachNumber = result % eachNumber;
            result = temp;
        }
        
        return result; 
    }

    // LCM calculator method
    public static int calculateLCM(int result, int eachNumber){
        return (result * eachNumber) / calculateGCD(result, eachNumber);
    }

    // Passing each number for calculation
    public static int calculateLCMOfArray(int[] numberInputs){
        int result = numberInputs[0];
        for(int i = 1; i < numberInputs.length; i++){
            result = calculateLCM(result, numberInputs[i]);
        }
        
        return result;
    }
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user how many number will they input
        System.out.println("How many numbers will they input? ");
        int numOfInputs = inputScanner.nextInt();

        // Error handler
        if(numOfInputs <= 0){
            System.out.println("Please enter a positive integer.");
            inputScanner.close();
            return;
        }
        
        // Declare an array to store the inputs
        int[] numberArray = new int[numOfInputs];

        // Ask the user for the inputs
        for(int i = 0; i < numOfInputs; i++){
            System.out.print("Number " +  (i + 1) + ": ");
            numberArray[i] = inputScanner.nextInt();
        }

        // Find the LCM
        int result = calculateLCMOfArray(numberArray);
        System.out.println("The LCM of the given numbers is: " + result);

        inputScanner.close();
    }
}