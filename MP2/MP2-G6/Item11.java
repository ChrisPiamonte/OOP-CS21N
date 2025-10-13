import java.util.Scanner;
//Magic Number with Steps
public class Item11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inputNum = scanner.nextInt();

        int originalNum = inputNum;
        int stepCounter = 1;

        while (true) {
            int totalSum = 0;
            int tempNum = inputNum;
            String steps = "";

            while (tempNum > 0) {
                int digit = tempNum % 10;
                totalSum += digit * digit;
                steps = digit + "^2 + " + (tempNum / 10 > 0 ? "" : "") + steps;
                tempNum /= 10;
            }

            System.out.println("Step " + stepCounter + ": " + inputNum + " -> " + totalSum + " (" + steps + " = " + totalSum + ")");

            if (totalSum == 1) {
                System.out.println(originalNum + " is a Magic Number.");
                break;
            }

            if (totalSum == 4) {
                System.out.println(originalNum + " is not a Magic Number.");
                break;
            }

            inputNum = totalSum;
            stepCounter++;
        }

        scanner.close();
    }
}
