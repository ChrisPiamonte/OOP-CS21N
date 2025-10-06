import java.util.Scanner;
/*
 * Item 1. Factorial of Multiple Numbers
 * A Factorial of a number is the product of all positive number from 1 to n
 */
public class Item1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        
        //Ask user how many numbers they want to enter
        System.out.println("How many numbers do you want to input? ");
        int intNum = 0;

        if(sc.hasNextInt()){
            intNum = sc.nextInt();
        }

        //Create an array to store the numbers
        int[] arrTerm = new int[intNum];
        System.out.println("Enter the elements of the array: ");

        //Input numbers
        for(int index = 0; index < intNum; index++){
            if(sc.hasNextInt()){
                arrTerm[index] = sc.nextInt();
            }
        }
        
        //Find the factorial of each item
        for(int index=0;index<intNum;index++){
            long factorial = 1;
            for(int counter = arrTerm[index]; counter>1;counter--){
                factorial = factorial*counter; // factorial is multiplied to the current value of the counter
            }
            System.out.println("The factorial of " + arrTerm[index] + " is " + factorial); //Display the final value of the factorial of the number
        }
        sc.close();
    }

}


