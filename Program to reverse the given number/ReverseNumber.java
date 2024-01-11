import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = scan.nextInt();

        // Call the function to reverse the number
        int reverseNumber = reverseNumber(userInput);

        System.out.println("Reverse number: " + reverseNumber);
        scan.close();
    }

    // Function to reverse a given integer
    public static int reverseNumber(int number) {
        int reversedNubmer = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNubmer = reversedNubmer * 10 + digit;
            number /= 10;
        }
        return reversedNubmer;
    }
}
