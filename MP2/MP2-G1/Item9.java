import java.util.Scanner;
/*
 * Item 9. LCM of Multiple Numbers
 *  Following the Euclid's Algorithm Method: 
 *  LCM (a, b) = a * b / GCD(a,b)
 * 
 */

public class Item9 {
    //Method to find the GCD
    static int gcd(int a, int b){

        //Loops until the GCD of a pair is found
        while(b!=0){
            int temp = b;
            b = a % b; //Remainder becomes the new divisor
            a = temp; //Divisor becomes the new dividend
        }

        return a;
    }
  
    //Method to find the LCM
    static int lcm(int a, int b){
        return (a*b)/gcd(a, b); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to input: ");
        int intNum = 0;

        //Validate that the user enters an integer
        if(sc.hasNextInt()){
            intNum = sc.nextInt();
        }

        int[] arrTerm = new int[intNum];
        System.out.println("Enter the numbers: ");

        //Reads intNum integers from the user 
        for(int index = 0; index<intNum;index++){
            if(sc.hasNextInt()){
                arrTerm[index] = sc.nextInt();
            }
        }
        //Initiatize result with first number
        int result = arrTerm[0]; 

        //Computes the LCM of all numbers by pair
        for(int index = 1; index < intNum; index++){
            result = lcm(result, arrTerm[index]); // Call methods
        }


        System.out.println("The LCM of the numbers is " + result);

        sc.close();
    }
}
