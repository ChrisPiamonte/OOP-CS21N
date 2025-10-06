import java.util.Scanner;
//Fibonacci Sequence with Sum
public class Item2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of terms: ");
        int inputTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        int totalSum = 0;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= inputTerms; i++) {
            System.out.print(firstTerm + " ");
            totalSum += firstTerm;

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\nSum of all terms: " + totalSum);

        scanner.close();
    }
}
