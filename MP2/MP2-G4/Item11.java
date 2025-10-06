import java.util.Scanner;

public class Item11 {
    public static void main(String[] args) {
        int intNum;
        Scanner input = new Scanner(System.in);
        
        // Input number
        System.out.println("Enter a number to check if it's a Magic Number: ");
        intNum = input.nextInt();

        int intSteps = intNum;
        int intSum = 0;

        // Output initial number
        System.out.print("Steps: " + intSteps);

        // Process to determine if it's a Magic Number
        while (intSteps != 1 && intSteps != 4) {
            intSum = 0;
            while (intSteps > 0) {
                int digit = intSteps % 10;
                intSum = intSum + (digit * digit);
                intSteps = intSteps / 10;
            }
            intSteps = intSum;
            System.out.print(" -> " + intSteps); // Print each step
        }


        System.out.println();
        // Output result
        if (intSteps == 1)
            System.out.println(intNum + " is a Magic Number!");
        else
            System.out.println(intNum + " is NOT a Magic Number.");
    }

}
