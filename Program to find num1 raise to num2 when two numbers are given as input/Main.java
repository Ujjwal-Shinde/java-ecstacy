import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your first number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter your second number : ");
            int num2 = sc.nextInt();
            int ans = 1;
            for (int i = 1; i <= num2; i++) {
                ans *= num1;
            }
            System.out.println(num1 + " raise to " + num2 + " = " + ans);
        }
    }
}