import java.util.Scanner;

public class Item14 {
    public static int secondSmallest(int[] array, int size) {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
        }
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (array[i] < secondMin && array[i] > min) {
                secondMin = array[i];
            }                          
        }

        if (secondMin == Integer.MAX_VALUE) {
                return -1;
        }
        return secondMin;
    }

    public static int secondLargest(int[] array, int size) {
        int max = array[0];

        for (int i = 1; i < size; i++ ) {
            if(array[i]> max) {
                max = array[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
                
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }
        return secondMax;
    }
    
    public static void main (String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize;
        arraySize = in.nextInt();
        int[] array = new int[arraySize]; 

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter Number: " );
            int numbers = in.nextInt();
            array[i] = numbers;
        }
       
       System.out.println("Second Smallest: " + secondSmallest(array, arraySize));
       System.out.println("Second Largest: " + secondLargest(array, arraySize)); 
       
       in.close();
    }
}
