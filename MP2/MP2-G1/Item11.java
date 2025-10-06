import java.util.Scanner;

public class Item11 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);     

        int intInputNum = objScanner.nextInt();
        int intNext = intInputNum, intTemp = 0, intDigit = 0;

        boolean boolFirst = true, boolCycle = false;
        int intSingle = 0;

        while (intNext != 1) {
            intTemp = intNext;
            intNext = 0;
            boolFirst = true;

            System.out.print(intTemp + " -> ");

            while (intTemp != 0) {
                intDigit = intTemp % 10;
                intNext += intDigit * intDigit;
                intTemp /= 10;

                // print step-by-step format
                if (!boolFirst) System.out.print(" + ");
                boolFirst = false;
                System.out.print(intDigit + "^2");
            }

            System.out.println(" = " + intNext);
            
            // check if single digit result repeat before evaluation
            if (intNext != 1 && intNext < 9) {
                if (!boolCycle || intSingle != intNext) {
                    boolCycle = true;
                    intSingle = intNext;
                } else {break;}
            }
        }

        if (intNext == 1) {
            System.out.println(intInputNum + " is a magic number.");
        } else {
            System.out.println(intInputNum + " is NOT a magic number.");
        }

        objScanner.close();   
    }
}