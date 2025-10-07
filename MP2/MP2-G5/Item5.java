import java.util.Scanner;

public class Item5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
          int intCount = scanner.nextInt();
        System.out.print("\n ----------------------------\n ");

        System.out.println("Enter " + intCount + " numbers:");
        String strPalindromes = "";

        for (int i = 0; i < intCount; i++) {
            int intNumber = scanner.nextInt();
            if (isPalindrome(intNumber)) {
                strPalindromes += intNumber + " ";
            }
        }

        if (strPalindromes.isEmpty()) {
            System.out.println("No palindrome numbers found.");
        } else {
            System.out.println("Palindrome numbers found: " + strPalindromes);
        }
        scanner.close();
    }

    public static boolean isPalindrome(int intNumber) {
        String strNumber = Integer.toString(intNumber);
        String strReverse = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(strReverse);
    }
}

