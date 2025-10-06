import java.util.Scanner;
public class Item12 {

//This is a Sum and Difference program with a twist.
// Ask the user for an array of numbers
//Separate the arrays into odd and even
//Calculate the sum of the odd and the even set of integers
//Display the sum of both
//Calculate the difference of the two sums
//Display the difference

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int amount; //Variable to hold the range of the amount of numbers the user wants to input
        int[] storage, odd, even; //The array to hold the values of the numbers, as well as arrays for both the even and odd numbers
        int evenIndex = 0; //The index of even numbers
        int oddIndex = 0; //The index of odd numbers
        int sumEven = 0; //Variable for holding the sum of the even numbers
        int sumOdd = 0; //Variable for holding the sum of the odd numbers
        int total; //The variable to hold the difference of the two numbers

        System.out.println("This is a Sum and Difference program with a twist.");
        System.out.print("Enter a desired amount of numbers (Max 20): "); //Prompt to ask the user for a number
        amount = scanner.nextInt(); //Scanner to fetch the input

        storage = new int[amount]; //Assign the fetched amount as the index size of the storage array
        // Parameter checker
        if (amount <= 20) {
            for (int i = 0; i < amount; i++){ //Loop for array data fetch
                System.out.print("Please enter number #" + (i+1) + "(Max 100): ");
                storage[i] = scanner.nextInt();
            }

            even = new int[amount];
            odd = new int[amount];
            
            //For loop for indexing data into proper containers
            for (int data: storage){
                if (data % 2 == 0){
                    even[evenIndex] = data;
                    evenIndex++;
                } else {
                     odd[oddIndex] = data;
                    oddIndex++;
                }
            }

            //For loops for adding data
            for (int i = 0; i < evenIndex; i++) {
                sumEven += even[i];
            }
            for (int i = 0; i < oddIndex; i++) {
                sumOdd += odd[i];
            }

            //Data displays
            System.out.println("The sum of all even numbers are: " + sumEven);
            System.out.println("The sum of all odd numbers are: " + sumOdd);
            
            //Calculating difference of evensum and oddsum
            total = sumEven - sumOdd;
            //Display
            System.out.println("The difference of the sum of both even and odd numbers is: "+ total);

        } else{
            System.out.println("AMOUNT EXCEEDED!!!! TRY AGAIN");
            
        }

        scanner.close();
    }
}


