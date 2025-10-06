import java.util.*;

public class Item4 {
    public static int length(int num) {
        int length = 0;
        if (num == 0) {
            return 1;
        }
        while(num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    // Armstrong count method to determine the array size.
    public static int armstrongCount(int lower, int upper) {
        int temp = 0;
        int armstrong = 0;
        int count = 0;
        int digit = 0;
        
        for(int i = lower; i <= upper; i++) {
            armstrong = 0;
            temp = i;
            int length = length(i);
            while (temp != 0) {
                digit = temp % 10;
                armstrong += (int) Math.pow(digit, length);
                temp /= 10;
            }
            if (armstrong == i) {
                count++;
            }
        }
        return count;
    }

    public static int[] armstrong(int lower, int upper, int count) {
        int temp = 0;
        int armstrong = 0;
        int digit = 0;
        int counter = 0;
        int[] arr = new int[count];
        for(int i = lower; i <= upper; i++) {
            armstrong = 0;
            temp = i;
            int length = length(i);
            while (temp != 0) {
                digit = temp % 10;
                armstrong += (int) Math.pow(digit, length);
                temp /= 10;
            }
            if (armstrong == i) {
                arr[counter++] = armstrong;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int lower = 0;
        int upper = 0;

        System.out.println("Select a range of number (Ex. 1 to 100)");

        do {
            System.out.print("Lower limit: ");
            lower = scanner.nextInt();

            if (lower < 0) {
                System.out.println("Enter a number greater than 0.");
            }
        } while (lower < 0);

        do {
            System.out.print("Upper limit: ");
            upper = scanner.nextInt();

            if (upper < 0) {
                System.out.println("Enter a number greater than 0.");
            }
        } while (upper < 0);
        scanner.close();
        
        int armstrongCount = armstrongCount(lower, upper);

        int[] Arr = armstrong(lower, upper, armstrongCount);

        System.out.print("Between the range (" + lower + ", " + upper + ") There are " + armstrongCount + " Armstrong number/s");
        if (armstrongCount > 0) {
            System.out.print(", namely (");
            for(int i = 0; i < armstrongCount; i++) {
                System.out.print(Arr[i]);
                if (i < armstrongCount - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println(").");
                }
            }
        }
    }
}