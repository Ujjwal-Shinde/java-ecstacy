import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scan.nextInt();

        if (userInput < 0) {
            userInput = Math.abs(userInput); // Take the absolute value for negative numbers
        }

        if (userInput == 0) {
            System.out.println("Number of digits: " + 1); // Handeling 0 as an Input
        } else {
            int number = userInput;
            int digitCount = 0;

            // Use a while loop to count digits
            while (number != 0) {
                number /= 10;
                digitCount++;
            }
            System.out.println("Number of digits: " + digitCount);
        }
        scan.close();
    }
}
