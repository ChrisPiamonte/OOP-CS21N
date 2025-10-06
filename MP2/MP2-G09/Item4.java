import java.util.Scanner;


public class Item4{
    public static void main(String[] args){


        int remainder, sum, currentNumber, digits; //Initialization


        Scanner scanner = new Scanner (System.in);


        //Input a digit
        System.out.println("Enter a starting Number:");
        int startRange = scanner.nextInt();


        System.out.println("Enter a ending Number:");
        int endRange = scanner.nextInt();




        //Iterate from Starting Input to Ending Input
        for(int i = startRange; i <= endRange; i++){


            currentNumber = i; //Store
            sum = 0; //For each number sum will reset to zero
            digits = String.valueOf(i).length(); //Count how many digits in a Number


            //Algorithm for Armstrong
            while(currentNumber != 0){
                remainder = currentNumber % 10; //Isolate each digits
                sum += Math.pow(remainder, digits); //Using digits as a power to sum each remainder
                currentNumber = currentNumber / 10; //reduce number by 10 for Isolation
            }


                //Check if the sum of each digits is equal to the given number
                if (sum == i){
                    System.out.println(i + " is an Armstrong Number");
                }


        }


        scanner.close();
    }
}
