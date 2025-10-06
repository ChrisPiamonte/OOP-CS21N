// 11. Magic Number with Steps
// A Magic Number is a number that eventually becomes 1 when replaced repeatedly with the sum
// of the squares of its digits. Write a program to check whether a number is a Magic Number and
// display the step-by-step transformation.

import java.util.*;

 public class Item11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
		System.out.println("");

        int origNum = num;

        System.out.println("Magic Number Process:");
        do {
            System.out.print(num + " --> ");
            int sum = 0;
            int temp = num;
            while (temp>0){
                int digit = temp % 10;
                sum += digit*digit;
                temp = temp/10;
            }
            num = sum;
            System.out.println(num);
        } while (num != 1 && num != 4);

        if (num == 1){
            System.out.println(origNum + " is a Magic Number");
        } else {
            System.out.println(origNum + " is not a Magic Number");
        }

        scanner.close();
    }
}