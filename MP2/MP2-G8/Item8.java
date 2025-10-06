import java.util.Scanner;

public class Item8 {
    public static void main (String[] args){
        Scanner console = new Scanner (System.in);
        int intNumber, intI;
        
        //Asks the user how many number are to be put
        System.out.print("How many numbers would you like to enter? ");
        intNumber = console.nextInt();

        //Asks the user what number are to be put
        int intArray[] = new int[intNumber];
        for(intI = 0; intI < intNumber; intI++){
            System.out.print((intI + 1) + ". ");
            intArray[intI] = console.nextInt();
        }
        
        //Finds the Greatest Common Divisor of those numbers
        int intGCD = intArray[0];
        for(intI = 1; intI < intNumber; intI++){
            int intA = intGCD;
            int intB = intArray[intI];
            while(intB != 0){
                int intTemp = intB;
                intB = intA % intB;
                intA = intTemp;
            }
            intGCD=intA;
        }

        //Prints out the GCD of the numbers
        System.out.println("The GCD is " + intGCD);
    }
}