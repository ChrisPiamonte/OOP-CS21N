/*Count Digits and Find Largest Digit
Write a program that counts how many digits a number has and also displays the largest digit in
the number.*/

import java.util.Scanner;

class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberString = "";
        int number = 0;
        System.out.println("--- Welcome to the Digit Counter and Max Digit Finder and analyzer!---");
        while (true) {
            System.out.println("Enter your Whole Number:");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    numberString = String.valueOf(number);
                    break;
                } else {
                    System.out.println("The number must be positive. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid whole number (e.g., 12345).");
                scanner.next();  
            }
        }
        //counter
        int digitCount = numberString.length();
        //finder
        int largestDigit = -1;
        for (int i = 0; i < digitCount; i++) {
            char charDigit = numberString.charAt(i);
            int currentDigit = Character.getNumericValue(charDigit);

            if (currentDigit > largestDigit) {
                largestDigit = currentDigit;
            }
        }
        //displaying everything hehe
        System.out.println("You asked me to analyze the number: " + numberString);
        System.out.println("Analysis Results:");
        System.out.println("1. Total Digits Found: " + digitCount);
        System.out.println("2. Largest Digit: " + largestDigit);

        scanner.close();
    }
}


