import java.util.Scanner;
public class Item4 {

    public static void armstrongNumbers (int intMin, int intMax) {
        for (int i = intMin; i <= intMax; i++) {
            String intDigits = Integer.toString(i); 
            int intDigitsCount = intDigits.length();
            int intSum = 0;

            for (int j = 0; j < intDigitsCount; j++) {
                int intDigit = Character.getNumericValue(intDigits.charAt(j));
                intSum += Math.pow(intDigit, intDigitsCount);
            }

            if (intSum == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
        return;
    }
    public static void main(String[] args) {
        int intMin = 0;
        int intMax = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the minimum range: ");
        intMin = input.nextInt();
        System.out.println("Please enter the maximum range: ");
        intMax = input.nextInt();
        System.out.println("Armstrong numbers between " + intMin + " and " + intMax + " are: \n");
        armstrongNumbers(intMin, intMax);
    }

}
