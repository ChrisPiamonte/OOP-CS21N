import java.util.Scanner;

public class Item9{
    public static int gcdFinder(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcmFinder(int a, int b) {
        return (a * b) / gcdFinder(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements;
        int LCM = 0;

        System.out.print("Enter how many elements you want to have in the array: ");
        numOfElements = scanner.nextInt();
        System.out.println("Enter the numbers: \n");

        int listOfNum[] = new int[numOfElements];

        for(int i = 0; i < numOfElements; i++) {
            System.out.print("Element " + (i+ 1) + ": ");
            listOfNum[i] = scanner.nextInt();
        }

        for(int i = 0; i < numOfElements; i++ ) {
            
            if(i == 0){
                LCM = listOfNum[0];
            }

            LCM = lcmFinder(LCM, listOfNum[i]);

        }
        System.out.println("\n The LCM of all the elements is: " + LCM);

     scanner.close();   
    }
}