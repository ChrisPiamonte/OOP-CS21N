import java.util.Scanner;   // Import Scanner class


public class Item11
{


    // Create a method that returns the sum of the squares of the number's digits
    public static int sumOfSquares(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            int digit = num % 10;   // Get the last digit of the number
            sum = sum + (digit * digit); // Square the digit and add to the sum
            num = num / 10;     // Remove the last digit from the number
        }
        return sum;     //Return the sum of squares
    }


    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);   // Create Scanner object for user input
       
        System.out.println("[ Magic Number with Steps ]");

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();   // Store input number
        int currentNum = num;          // Set the inputted number as the currentNum


        System.out.println("Let's check if the number is Magic or not:");
       
        // Lopp until the current number reaches 1 (Magic) or 4 (Not Magic-loop trap)
        while (currentNum != 1 && currentNum != 4)
        {
            System.out.println(currentNum + " ===> " + sumOfSquares(currentNum));
            currentNum = sumOfSquares(currentNum);
        }


        // Final result after the loop ends
        if (currentNum == 1)
            System.out.println(num + " is a Magic Number!");
        else
            System.out.println(num + " is NOT a Magic Number.");
       
        scanner.close();
    }
}
