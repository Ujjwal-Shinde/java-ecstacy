import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Binary Number : ");
            int decimalNum = sc.nextInt();
            int ans = 0;
            int pw = 1;
            while (decimalNum > 0) {
                int parity = decimalNum % 2;
                ans += (parity * pw);
                pw *= 10;
                decimalNum /= 2;
            }
            System.out.println(ans);
        }
    }
}