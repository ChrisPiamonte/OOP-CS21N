import java.util.Scanner;

public class Item4 {

    public static boolean isArmstrong (int intNum){
        String digits = Integer.toString(intNum);
        int power = digits.length();
        int sum = 0;

        for(char d : digits.toCharArray()){
            int digit = d - '0';
            sum += Math.pow(digit, power);
        }
        return sum==intNum;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
      
        System.out.println("Enter the lowest value of the range: ");
        int lowValueIntRange = scanner.nextInt();

        System.out.println("Enter the highest value of the range: ");
        int highValueIntRange = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowValueIntRange + " and " + highValueIntRange + " are as follows");
        boolean found = false;

        for(int i = lowValueIntRange +  1; i < highValueIntRange; i++){
            if(isArmstrong(i)){
                System.out.println(i);
                found = true;
            }   
        }

        if(!found){
            System.out.println("None.");
        }
        scanner.close();
    }
}