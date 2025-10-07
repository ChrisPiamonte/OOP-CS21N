import java.util.Scanner;

public class Item2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		// Asks the user to enter number of terms
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		
		// Initialization of Fibonacci numbers
		int firstNum = 0, secondNum = 1;
		int sum = 0;
				
		System.out.println("\nHere are the first " + n + " terms of Fibonacci:");
		
		// Generates sequence 
		for(int i = 1; i <= n; i++) {
			System.out.println(firstNum);
			sum += firstNum;					
					
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
			
		// Displays the sum
		System.out.println("\nThe sum of numbers are " + sum + "."); 	
				
		scanner.close();
	}			
}