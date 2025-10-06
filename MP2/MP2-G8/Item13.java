import java.util.*;

public class Item13 {
    static int Sort(int intArray[], int intChoice){ //Bubble Sort Algorithm to find the minimum and maximum values
        for (int intCounter = 0; intCounter < intChoice - 1; intCounter++){
            for (int intCounterTwo = 0; intCounterTwo < intChoice - intCounter - 1; intCounterTwo++){
                if (intArray[intCounterTwo] > intArray[intCounterTwo + 1]) {
                    int intTemp = intArray[intCounterTwo];
                    intArray[intCounterTwo] = intArray[intCounterTwo + 1];
                    intArray[intCounterTwo + 1] = intTemp;
                }
            }
        }

        //Algorithm to calculate and returns the sum of all elements in the array
        int intArraySum = 0;
        int intIndex = 0;
        while (intIndex < intChoice){
            intArraySum += intArray[intIndex];
            intIndex++;
        }
        return intArraySum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int intChoice;
            double dblArrayAverage = 0;

        //Asks the user how many numbers they want to enter
        System.out.print("Enter how many numbers you want in your array: "); 
        intChoice = scan.nextInt();
        int[] intArray = new int[intChoice];

        //Fill the array with the given input from the user
        System.out.println("Enter " + intChoice + " numbers: ");
        for (int intLoop = 0; intLoop < intChoice; intLoop++){
            intArray[intLoop] = scan.nextInt();
        }

        //Prints the number array for reference
        System.out.println("\nNumbers in your array: ");
        for (int intLoop = 0; intLoop < intChoice; intLoop++){
            System.out.print(intArray[intLoop] + " ");
        }
        System.out.println();

        int intArraySum = Sort(intArray, intChoice); //Call method to sort and sum the given array
        dblArrayAverage = (double) intArraySum / intChoice; //Formula for getting the average

        System.out.println("The maximum number in your array is " + intArray[intChoice - 1]); //Displays the largest element
        System.out.println("The minimum number in your array is " + intArray[0]); //Displays the smallest element
        System.out.println("The average of all numbers in your array is " + dblArrayAverage); //Displays the average of the number array

        scan.close();
    }
}