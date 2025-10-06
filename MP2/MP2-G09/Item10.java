import java.util.Scanner; // Import Scanner class


public class Item10
{


    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
   
        //Initialize variables
        int count = 0;
        int largestDigit = 0;

        System.out.println("[ Count Digits and Find Largest Digit ]");

        System.out.print("Enter a number: "); // Ask the user to enter a number
        int num = scanner.nextInt(); // Read the user's input


        while (num > 0) // Use while-loop until there are no more digits left
        {
            int digit = num % 10; // Get the last digit of the number
            count++; // Increase the digit count by 1 after getting the last digit of each iteration
           
            if (digit > largestDigit) largestDigit = digit; // Update the largest digit if current one is bigger
            num = num / 10; // Remove the last digit from the number
        }


        System.out.println("Number of Digits: " + count);
        System.out.println("Largest Digit: " + largestDigit);


        scanner.close();
    }
}
