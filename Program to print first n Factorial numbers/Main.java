import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your number : ");
            int num = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
                System.out.println("Factorial of " + i + ": " + factorial);
            }
        }
    }
}