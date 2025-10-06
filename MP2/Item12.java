import java.util.*;

public class Item12 {

    public static boolean isEven(int num) {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sumOfEven = 0;
        int sumOfOdd = 0;
        int diffOfSums = 0;

        System.out.print("\nEnter size of array: ");
        int arrSize = scanner.nextInt();

        if(arrSize < 1){
            System.out.println("Range of numbers must be greater than 1.");
        }

        int[] arr = new int[arrSize];
        
        System.out.println("\nEnter " + arrSize + " numbers:");
        for(int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arrSize; i++){
            if(isEven(arr[i]))
            {
                sumOfEven+=arr[i];
            }else 
            {
                sumOfOdd+=arr[i];
            }
        }
        
        if(sumOfEven > sumOfOdd)
        {
            diffOfSums = sumOfEven - sumOfOdd;
        }else
        {
            diffOfSums = sumOfOdd - sumOfEven;
        }
        
        System.out.println("\nTotal sum of Even numbers: " + sumOfEven);
        System.out.println("Total sum of Odd numbers: " + sumOfOdd);
        System.out.println("\nDifference between the two sums: " + diffOfSums);
        scanner.close();
    }
}
