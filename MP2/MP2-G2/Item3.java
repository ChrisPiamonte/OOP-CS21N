/*
 * ======= Number 3 =============
 * Prime Number in a Range  
 * Write a program that accepts two numbers as a range and prints all prime numbers within that
 * range. Also, display how many prime numbers were found.
 */
import java.util.Scanner;

class PrimeCheck {
    //checks if the number is a prime number
        boolean isPrime(int num) {
        if (num <= 1) return false; 
        for(int i = 2; i <= num / 2; i++) {
            if(num%i == 0){ 
                return false;
            }
        }
        return true;
    }
}

public class Item3 {
    public static void main(String[] args) {
        int startNum, endNum; //contains the value of the two numbers
        int primeCount = 0; //number of found prime number

        PrimeCheck check = new PrimeCheck();
        Scanner sc = new Scanner(System.in);

        //user input for startNum and endNum
        System.out.print("Enter Start Number: ");
        startNum = sc.nextInt();

        System.out.print("Enter End Number: ");
        endNum = sc.nextInt();

        //Printing of Outputs
        for(int i=startNum; i<=endNum; i++){
            if (check.isPrime(i)) {
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.println("\nTotal prime numbers: " + primeCount); //print the count of prime numbers

        sc.close();
    }
}