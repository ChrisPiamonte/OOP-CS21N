import java.util.Scanner;

public class Item8{

    // GCD calculator method
    public static int calculateGCD(int result, int eachNumber){
        while(eachNumber != 0){
            int temp = eachNumber;
            eachNumber = result % eachNumber;
            result = temp;
        }
        
        return result; 
    }

    // Passing each number for calculation
    public static int calculateGCDOfArray(int[] numberInputs){
        int result = numberInputs[0];
        for(int i = 1; i < numberInputs.length; i++){
            result = calculateGCD(result, numberInputs[i]);
        }

        return result;
    }
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user how many numbers will they input
        System.out.println("How many numbers will you input? ");
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
            System.out.print("Number " + (i + 1) + ": ");
            numberArray[i] = inputScanner.nextInt();
        }

        // Find the GCD of each number and display them
        int result = calculateGCDOfArray(numberArray);
            
        System.out.println("The GCD of the given numbers is " +  result);

        inputScanner.close();
    }
}