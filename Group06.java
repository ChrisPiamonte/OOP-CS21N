public class Group06{
    public static void main(String[] args) {
        // Hardcode the limit to any number
        int intLimit = 12;

        // declaration of variable for the sum of cubes
        int intSumCube = 0;

        System.out.println("Number Square Cube");

        // for loop to iterate every number to n
        for (int intNumber = 1; intNumber <= intLimit; intNumber++) {
            
        // formula to get the square of i
            int intSquare = intNumber * intNumber;

        // formula to get the cube of i
            int intCube = intNumber * intNumber * intNumber;

        // prints the table of square and cubes of i
            System.out.println(intNumber + "\t" + intSquare + "\t" + intCube);

        // calculates the sum of all cubes 
            intSumCube += intCube;
        }

        // prints the sum of all cubes
        System.out.println("\nThe sum of all cubes from 1 to " + intLimit + ": " + intSumCube);
    }
}