import java.util.*;

public class Item12 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int intStart, intEnd; 
            int intEvenSum = 0;
            int intOddSum = 0;
            int intDifference = 0;

        //Asks the user for the start and end of the range
        System.out.print("Enter start of range: ");
        intStart = scan.nextInt();
        System.out.print("Enter end of range: ");
        intEnd = scan.nextInt();

        //Displays all the numbers within the given range
        System.out.println("\nHere are the numbers in your range: ");
            for (int intLoop = intStart ; intLoop <= intEnd; intLoop++){
                System.out.print(intLoop + " ");
                if (intLoop % 2 == 0){ //Checker whether the number is odd and even and update the corresponding sum
                    intEvenSum += intLoop;
                } else {
                    intOddSum += intLoop;
                }
            }
        
        System.out.println();

        //Calculate the absolute difference between the odd and even sums
        intDifference = intEvenSum - intOddSum;
        if (intDifference < 0) {
            intDifference = -intDifference;
        }

        System.out.println("The sum of all even numbers in your range is: " + intEvenSum);
        System.out.println("The sum of all odd numbers in your range is: " + intOddSum);
        System.out.println("The difference in the even and odd numbers in your range is: " + intDifference);
        
        scan.close();
    }
}