import java.util.Scanner;

public class Item1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements;
        System.out.print("Enter how many numbers you want to find the factorial of: ");
        numOfElements = scanner.nextInt();
        
        int arrayOfNum[] = new int[numOfElements];

        for(int i = 0; i < numOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayOfNum[i] = scanner.nextInt();
        }
        
        System.out.println("Factorials of the numbers:");

        for(int i = 0; i < numOfElements; i++) {
            System.out.print("The factorial of " + arrayOfNum[i] + " is: ");
            for(int j = arrayOfNum[i]; j > 1;){
                j--;
                arrayOfNum[i] *= j;
            }
            System.out.println(arrayOfNum[i]);
        }

        scanner.close();    
    }
}