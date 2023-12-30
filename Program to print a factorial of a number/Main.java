import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Number : ");
            int num = sc.nextInt();
            int ans = 1;
            for (int i = 2; i <= num; i++) {
                ans *= i;
            }
            System.out.println(ans);
        }
    }
}