import java.util.Scanner;
public class Item8 {
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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Finding the GCD of Multiple Numbers");

        //Asks the users for how many numbers to input
        System.out.print("Enter how many numbers: ");
        int n = input.nextInt();

        int[] intNumbers = new int[n]; //Array to store the numbers entered

        //Input numbers
        for(int i = 0; i < n; i++){
            System.out.print("Enter numbers for "+ (i + 1) +": ");
            intNumbers[i] = input.nextInt();
        }

        //Compute GCD of all the numbers in the array
        int gcd = intNumbers[0];
        for(int i = 1; i < n; i++){
            gcd = findGCD(gcd, intNumbers[i]);
        }

        //Display result
        System.out.println("The GCD of the numbers is: " + gcd);

        input.close();
    }
}
