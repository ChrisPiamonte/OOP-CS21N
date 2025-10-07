import java.util.Scanner;

public class Item6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			// Asks the user for input
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			
			// Repeats until the number becomes single digit
			while(num >= 10) {
				int sum = 0;
				int temp = num;
			
				System.out.print(num + " -> ");
				
				// Gets each digits and adds them
				while(temp > 0) {
					int digit = temp % 10;
					sum += digit;
					temp /= 10;
				
					System.out.print(digit);
					if (temp > 0) {
						System.out.print(" + ");
					}
				}
				
				// Shows the sum of digits
				System.out.println(" = " + sum);
			
				num = sum;
			}
			
			// Displays the final single digit sum
			System.out.println("\nThe single digit sum is " + num + ".");
		
			scanner.close();
		}		
	}	