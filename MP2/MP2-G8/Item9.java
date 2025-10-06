import java.util.Scanner;

public class Item9 {
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
        
        //Finds both the Greatest Common Divisor and Least Common Multiple of the numbers
        int intGCD = intArray[0];
        int intLCM = intArray[0];
        for(intI = 1; intI < intNumber; intI++){
            
            //Finds the GCD of the numbers
            int intA = intGCD;
            int intB = intArray[intI];
            while(intB != 0){
                int intTemp = intB;
                intB = intA % intB;
                intA = intTemp;
            }
            intGCD = intA;

            //Finds the LCM of the numbers
            intLCM = (intLCM * intArray[intI])/intGCD;
        }
        
        //Prints out the LCM of the numbers
        System.out.println("The LCM is " + intLCM);
    }
}