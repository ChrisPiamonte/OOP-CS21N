import java.util.Scanner;

public class Item6{
    public static void main(String[] args){


        int givenNum;
        int sum = 0;
        int remainder;


        Scanner scanner = new Scanner (System.in);


        System.out.println("Enter a number:");
        givenNum = scanner.nextInt();


        System.out.print("Starting digit: " + givenNum); //print the beginning


        //repeats the process until the digit is not single
        while(givenNum > 9){


            sum = 0;//reset sum to process each result


                //breaking down until single postive number
                while(givenNum > 0){
                remainder = givenNum % 10; //isolate a each digit
                sum += remainder; //Each isolate digit is added to one another
                givenNum = givenNum / 10; //reduce the number for isolation
                }


            givenNum = sum;//passes the result
            System.out.print(" -> " + givenNum); //loops the print statement to show the number of each process
        }


        scanner.close();
    }
}
