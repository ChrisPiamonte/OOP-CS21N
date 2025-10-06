public class Item2 {
    
    public static void main(String[] args) {
        // Initializing the variables needed
        int givenNumber = 8; // Fixed given number
        int firstNumber = 0, secondNumber = 1;
        int thirdNumber;
        int fibSum = 0;
        int iteration;


        System.out.println("[ Fibonacci Sequence with Sum ]");
        System.out.println("Given number = " + givenNumber);
        System.out.print("Sequence: ");


        // Algorithm
        for(iteration = 0; iteration < givenNumber; iteration++){
            System.out.print(firstNumber + " ");


            // Swapping and Sum
            fibSum += firstNumber; // Applying addition to fibSum
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.print("\nSum of the Sequence: " + fibSum); // Printing the Sum
    }
}
