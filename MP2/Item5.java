import java.util.*;

public class Item5 {

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int temp = 0;
        int reversed = 0;
        int counter = num;

        while (counter != 0) {
            temp = counter % 10;
            counter /= 10;
            reversed = reversed * 10 + temp;   
        }

        return num == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        do {
            System.out.print("How many numbers to be checked?: ");
            size = scanner.nextInt();

            if (size < 1) {
            System.out.println("Please enter a number greater than 0.");
            }
        } while (size < 1);
        
        

        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Enter number " + (i + 1) + " : ");
                arr[i] = scanner.nextInt();
                if (arr[i] < 1) {
                    System.out.println("Please enter a number greater than 0.");
                }
            } while (arr[i] < 1);
        }
        scanner.close();
            
        
        

        int index = 0;

        for (int i = 0; i < size; i++) {
            if (isPalindrome(arr[i])) {
                index++;
            }
        }

        int[] palindromeArr = new int[index];
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            if (isPalindrome(arr[i])) {
                System.out.println(arr[i] + " is a palindrome number.");
                palindromeArr[counter] = arr[i];
                counter++;
            } else {
                System.out.println(arr[i] + " is not a palindrome number.");
            }
        }

        System.out.println("Over " + size + " values, " + counter + " palindrome/s were found");
        if (counter > 0) {
            for (int i = 0; i < index; i++) {
            System.out.print(palindromeArr[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
            }
        }
    }
}