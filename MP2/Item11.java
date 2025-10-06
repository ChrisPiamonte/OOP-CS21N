import java.util.*;

// Magic Number with Steps

public class Item11 {
    static int[] digitsOf(int x) {
        int c = (int) Math.log10((double) x) + 1;
        int[] digits = new int[c];

        int n = x;
        while (n >= 1) {
            digits[--c] = n % 10;
            n /= 10;
        }

        return digits;
    }

    static void square(int[] nums) {
        for (int i = 0; i < nums.length; ++i)
            nums[i] *= nums[i];
    }

    static int sum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; ++i)
            sum += nums[i];

        return sum;
    }

    static void printDigits(int step, int[] digits) {
        printDigits(step, digits, " ");
    }

    static void printDigits(int step, int[] digits, String sep) {
        System.out.print("Step " + step + ": ");
        for (int i = 0; i < digits.length; ++i)
            System.out.print(digits[i] + (i < digits.length - 1 ? sep : ""));
        System.out.println();
    }

    static void magicNumber(int num) {
        System.out.println("======= NUMBER: " + num + " =======");

        int x = num;
        boolean isMagic = false;

        while (num != 1) {
            System.out.println();

            int[] digits = digitsOf(num);
            printDigits(1, digits);

            square(digits);
            printDigits(2, digits);

            printDigits(3, digits, " + ");

            num = sum(digits);
            System.out.println("Step 4: " + num);

            if (num == 1 || num == 4) {
                isMagic = num == 1;
                break;
            }
        }

        System.out.println();
        System.out.println("Number " + x + " is " + (isMagic ? "" : "not ") + "a Magic number!");

        System.out.println();
    }

    public static void main(String[] args) {
        // Tests
        magicNumber(100);
        magicNumber(1000);
        magicNumber(83);
        magicNumber(653);
        magicNumber(9102);
    }
}
