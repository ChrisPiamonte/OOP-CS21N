public class Group07 {
    public static void main(String[] args) {
        // 1. Set a starting number
        int number = 6; 
        // 2. Initialize step counter to 0
        int steps = 0;

        // 3. While number is not 1:
        while (number != 1) {
            // a. If number is even, divide by 2
            if (number % 2 == 0) {
                number = number / 2;
            // b. If number is odd, multiply by 3 and add 1
            } else {
                number = number * 3 + 1;
            }
            // c. Increment step counter
            steps++;
        }

        //  4. Output the total steps
        System.out.println("Total steps: " + steps);
    }
}
