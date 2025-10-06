import java.util.Scanner;

public class Item8{
    public static int gcd (int a, int b){

        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }   

    public static int findGCD (int[] arr){
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            result = gcd(arr[i], result);

            if (result==1)
                return 1;
            
        }
        return result;
    } 
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of elements here: ");
        int sizeOfArray = sc.nextInt();

        int arr[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++){
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("The greatest Common Divisor among numbers: ");
        for(int i = 0; i < sizeOfArray; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        System.out.println(findGCD(arr));
        sc.close();
    }
}   