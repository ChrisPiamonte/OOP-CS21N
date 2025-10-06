import java.util.Scanner;

public class Item11{

    static int sumOfSquares(int n) {
        int sum = 0;
        int temp = n;
        String process = "";

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit;

            if (process.isEmpty()) {
                process = digit + "^2";
            } else {
                process = digit + "^2 + " + process;
            }

            temp = temp / 10;
        }

        System.out.println(process + " = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int[] seen = new int[1000];
        int index = 0;
        boolean isMagic = false;

        while (true) {
            int sum = sumOfSquares(n);

            if (sum == 1) {
                isMagic = true;
                break;
            }

            boolean repeated = false;
            for (int i = 0; i < index; i++) {
                if (seen[i] == sum) {
                    repeated = true;
                    break;
                }
            }

            if (repeated) {
                isMagic = false;
                break;
            }

            seen[index] = sum;
            index++;
            n = sum;
        }

        if (isMagic)
            System.out.println("It is a Magic Number!");
        else
            System.out.println("It is NOT a Magic Number.");

        scanner.close();
    }
}
