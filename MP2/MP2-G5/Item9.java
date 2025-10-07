import java.util.Scanner;

public class Item9 {
    
    public static int gcd (int a, int b){
        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }
    
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;  
    }

    public static int isLCM (int[] arr){
        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            result = lcm(result, arr[i]);

            if(result == 0)
                return 0;
        }
        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements here: ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++){
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }


        System.out.printf("The lcm of the array of numbers is %d", isLCM(arr));
        sc.close();
    }
    
}