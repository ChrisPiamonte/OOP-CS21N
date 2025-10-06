import java.util.*;

public class Item11 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declaration of variables and values
        int intNumber;
        int intSteps = 1;

        System.out.print("Enter a number: ");
        intNumber = scan.nextInt();

        int intTemp = intNumber;

        System.out.println("Is " + intNumber + " a Magic Number?");
        System.out.println("Step-by-step transformation: ");

        //Iterate until we reach 1 or 4
        while (intTemp != 1 && intTemp != 4) {
            int intSum = 0;
            System.out.print("Step " + intSteps + ": ");

            //Extract each digits from the intNumber and get the sum of squares
            while (intTemp > 0) {
                int intLastDigit = intTemp % 10;
                int intSquare = intLastDigit * intLastDigit;
                intSum += intSquare;
                intTemp /= 10;
            }

            //Prints the sum of square of digits
            System.out.println(" " + intSum);
            intTemp = intSum;
            intSteps++;
        }

        //Checks if the number is a Magic Number or not
        if (intTemp == 1) {
            System.out.println("YES, " + intNumber + " is a Magic Number.");
        } else {
            System.out.println("NO, " + intNumber + " is NOT a Magic Number.");
        }
        
        scan.close();
    }
}