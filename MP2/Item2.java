import java.util.*;

public class Item2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        int term = 0;

        do {
            System.out.print("Enter fibonacci term: ");
            term = scanner.nextInt();
            if (term < 1) {
            System.out.println("Please enter a term 1 or higher.");
            }
            if (term == 1) {
            System.out.println("The fibonacci has a sequence of 0 on the first term and has a sum of 0.");
            scanner.close();
            return;
            }
        } while (term < 1 );
        scanner.close();

        long arr[] = new long[term];
        arr[0] = 0;
        arr[1] = 1;
        sum = arr[0] + arr[1];

        for(int i = 2; i < term; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            sum += arr[i];
        }

        System.out.print("The fibonacci has a sequence of ");

        for(int i = 0; i < term; i++) {
            System.out.print(arr[i]);
            if (i < term - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" on the first " + term + " terms and has a sum combined of " + sum + ".");
    }
}