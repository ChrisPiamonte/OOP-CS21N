import java.util.Scanner;


public class Item5{
    public static void main (String[] args){
       
        int inputNumber = 0;
        int num;
        int currentNumber;
        int reverse;


        Scanner scanner = new Scanner (System.in);


        //Loops if a user enter negative number and 0
        while(inputNumber <= 0){
            System.out.println("Enter numbers of input:");
            inputNumber = scanner.nextInt();
        }


        //Iterates until the desired number of input
        for(int i = 0; i < inputNumber; i++){
            System.out.println("Enter " + "[" + (i + 1) + "]" + " number:");
            num = scanner.nextInt();


                currentNumber = Math.abs(num);
                reverse = 0; //resets after each reverse
               
                //
                while(currentNumber != 0){
                    reverse = (reverse * 10) + (currentNumber % 10); //Taking the rightmost digit and append to reverse
                    currentNumber = currentNumber / 10;
                }


            //checks if the reversed number is equal to the given input
            if(reverse == num){
                System.out.println(num + " is a Palindrome");
                System.out.println("------------------------");
            }else{
                System.out.println(num + " is not a Palindrome");
                System.out.println("------------------------");
            }
        }


        scanner.close();
    }
}
