import java.util.Scanner;

public class Item2 {

    public static int fibonacciSequenceSum (int count) {
        //initialization of the variables
        int term1 = 0;
        int term2 = 1;
        int sum = 0;

        //loop to find the sequence sum until it reach the desired number count 
        for (int i = 0; i < count; i++) {
            System.out.print(term1 + " ");  //prints the current Fibonacci term
            int nextTerm = term1 + term2; 
            sum += term1;                   //to keep adding the terms
            term1 = term2;                  //updates the term1 to be the next term in the sequence
            term2 = nextTerm;               //passes the value to advance in the sequence 
        }

        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input to find the number of terms the user desires
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");  
        int numberOfTerms = in.nextInt();

        // displaying the Fibonacci Sequence terms
        System.out.println(); 
        System.out.println("Sum: " + fibonacciSequenceSum(numberOfTerms));
        
        in.close();
    }

}
  




 
 