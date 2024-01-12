import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a non-negative integer: ");
        int userInput = scan.nextInt();

        // Checking if the number is non-negative
        if (userInput < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculating the factorial using a for loop
            int result = 1;
            for (int i = 1; i <= userInput; i++) {
                result *= i;
            }

            // Printing the result
            System.out.println("Factorial of " + userInput + " is: " + result);
        }

        // Closing the scanner
        scan.close();
    }
}
