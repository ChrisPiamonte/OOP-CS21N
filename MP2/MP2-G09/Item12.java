import java.util.Scanner;   //Import Scanner class


public class Item12
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   //Create a Scanner object for user input


        //Initialize variables
        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;

        System.out.println("[ Sum of Even and Odd Numbers with Difference ]");

        //Ask the user for the starting and ending value of the range (ex. 1-10)
        System.out.print("Enter the starting value: ");
        int start = scanner.nextInt();
       
        System.out.print("Enter the ending value: ");
        int end = scanner.nextInt();


        //Loop through all the numbers within the given range by the user
        for (int i = start; i <= end; i++)
        {
            // add number to either even or odd total
            if (i % 2 == 0) sumOfEvenNum += i;  
            else sumOfOddNum += i;      
        }


        int difference = (sumOfEvenNum - sumOfOddNum); // Calculate the difference between the two sums


        //Print all the needed output
        System.out.println("Sum of Even Numbers: " + sumOfEvenNum);
        System.out.println("Sum of Odd Numbers: " + sumOfOddNum);
        System.out.println("Difference between the two sums: " + difference);
       
        scanner.close();
    }
}
