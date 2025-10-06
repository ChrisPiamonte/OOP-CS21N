import java.util.Scanner;


public class Problem13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+ n +" numbers");

        int sum = 0;
        for(int i = 0; i <  n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int min = arr[0];
        int max = arr[0];
        double avg = (double) sum / n;

         for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Average: " + avg);

        sc.close();
    }
}