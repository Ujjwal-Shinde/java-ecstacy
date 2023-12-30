import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int originalNum = num;
            int ans = 0;
            while (num > 0) {
                int unit = num % 10;
                ans += (unit * unit * unit);
                num /= 10;
            }
            if (ans == originalNum) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }
    }
}