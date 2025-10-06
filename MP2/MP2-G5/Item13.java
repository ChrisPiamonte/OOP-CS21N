import java.util.Scanner;

public class Item13 {
	
	public static void main(String[] args) {
		
		// Initializes min and max
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
	
		Scanner scanner = new Scanner(System.in);
		
		// Creates array to store numbers
		int[] numbers = new int[5];
		System.out.print("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		// Finds the min, max and computes sum
		for(int i = 0; i < 5; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} if (numbers[i] > max) {
					max = numbers[i];
				}
				sum += numbers[i];		
				}
				
				// Computes the average of the array
				int ave = sum / numbers.length;
				
				// Displays the results
				System.out.println("\nMin: " + min + "\nMax: " + max + "\nAverage: " + ave);
					
				scanner.close();
		
	}					
	
}
