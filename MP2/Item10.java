import java.util.*;

public class Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0; 
        
        do {
            System.out.print("Enter a number to find its digit count as well as the largest digit: ");
            num = scanner.nextInt();

            if (num < 1) {
                System.out.println("Enter a number greater than 0.");
            }
        } while (num < 1);
        
        scanner.close();

        int largestDigit = 0;
        int digitCount = 0;
        int counter = num;
        int current = 0;

        while (counter != 0) {
            current = counter % 10;
            counter /= 10;
            digitCount++;

            if (current > largestDigit) {
                largestDigit = current;
            }
        }

        System.out.println("The number " + num + " has " + digitCount + " digit/s with the highest digit being " + largestDigit);
    }
}