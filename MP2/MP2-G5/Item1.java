import java.util.Scanner;

// This is a Factorial program where we as the user for a certain amount of numbers
// We calculate the factorial for each number
// we display the result for all input
// Factorial: n x (n - 1) x (n - 2).... x 1

public class Item1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int[] numbers; //This will contain the numbers given by the user
        int choice; //The amount of numbers to be inputted
        int acc = 1; //This is an accumulator, this is where we will store the product for the next loop
        int result; //Ths will contain the result when the inner loop ends

        System.out.println("This is a factorial program.");
        System.out.print("Please enter how many numbers you want to have the factorial calculated: ");
        choice = scanner.nextInt(); //Scanner to grab user input

        // Looping section to store user input into an array
        numbers = new int[choice]; //Assign choice into the array
        // Loop for putting the user's data into the loop
        for(int i = 0; i < choice; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        // Loop for calculating the factorial of each number
        for (int number : numbers) {
            for (int i = number; i > 0; i-- ){
                System.out.printf("%d * %d = %d \n", acc, i, acc * i); //Printing step by step
                acc *= i; //Multiplying the acc by index and storing answer back to acc
            }
            result = acc; //Assign acc to result
            System.out.println("Result: " + number + "!" + " = " + result + "\n"); //Print result

            acc = 1; //Reset acc back to one each iteration
            
        }

        scanner.close(); // Close scanner
    }
}