import java.util.Scanner;


public class Item8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array: ");


        int nSize = scanner.nextInt(); //Reads the size of array
        int[] array = new int[nSize];


        //Reads the elements of the array based on user input
        for (int index = 0; index < nSize; index++) {
            System.out.println("Input element #"+(index+1)+": ");
            array[index] = scanner.nextInt();
        }


        int result = array[0]; //initializes array from 1st element of the array


        //Finds the GCD of each element through iteration and method calling
        for (int index = 1; index < nSize; index++) {
            result = findGCD(result, array[index]);
        }


        //Displays the GCD of the array
        System.out.println("The GCD of the numbers in the array is "+ result);
        scanner.close();
    }
   
    private static int findGCD(int a, int b){


        //finds GCD of two numbers from the array
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
