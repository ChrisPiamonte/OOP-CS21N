import java.util.Scanner;
public class Item9 {
    //Method to compute the GCD of the numbers
    public static int findGCD(int a, int b){
        //Repeat until remainder becomes 0
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; //When b becomes 0, a is the GCD 
    }

    //Method to compute the LCM of the numbers
    public static int findLCM(int a, int b){
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the LCM of Multiple Numbers");

        //Asks the users for how many numbers to input
        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();

        int[] intNumbers = new int[n];//Array to store the numbers entered

        //Input numbers
        for(int i = 0; i < n; i++){
            System.out.print("Enter Number "+ (i + 1) + ": ");
            intNumbers[i] = input.nextInt();
        }

        int lcm = intNumbers[0]; //LCM initializes with the first number

        //Compute LCM of all the numbers in the array
        for(int i = 1; i < n; i++){
            lcm = findLCM(lcm, intNumbers[i]);
        }

        //Display result
        System.out.println("The LCM of the given numbers is: " + lcm);


        input.close();
    }
}
