import java.util.Scanner;


public class Item7 {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String numStr = scanner.nextLine();  //Reads the number as a string directly
       
        //Reverse the string manually and preserve leading zeros
        String reversedStr = reverseString(numStr);
       
        //Displays the result
        if (reversedStr.equals(numStr)){
            System.out.println(numStr + " is a Palindrome");
        }else{
            System.out.println(numStr + " is not a Palindrome (Reverse: " + reversedStr + ")");
        }
        scanner.close();
    }


    //Method for reversing a string
    private static String reverseString(String str){
        String reversed = "";
       
        //Reverses the string by iterating each characters (digit)
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
