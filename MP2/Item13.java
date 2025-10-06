import java.util.*;

public class Item13 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Inputs array size
        System.out.print("\nEnter size of array: ");
        int arrSize = scanner.nextInt();

        if(arrSize < 1){
            System.out.println("Array size must be greater than 1.");
        }

        //Intialization of variables
        int[] arr = new int[arrSize];
        int minNum = arr[0];
        int maxNum = minNum;
        int sumOfNum = 0;

        //Inputs values of the array
        for(int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }

        //Loop to determine the sum, maximum, and minimum number from the array
        for(int i = 0; i < arrSize; i++){
            sumOfNum+=arr[i];
            if(arr[i] > maxNum)
            {
                maxNum = arr[i];
            }else if(arr[i] < minNum) 
            {
                minNum = arr[i];
            }
        }

        //Calculates the average of all numbers
        float avgNum = (float) sumOfNum/arrSize;

        //Prints the value of each calculations
        System.out.printf("\nLargest number: %d", maxNum);
        System.out.printf("\nSmallest number: %d", minNum);
        System.out.printf("\nAverage of all numbers: %.2f", avgNum);

        scanner.close();
    }

}
