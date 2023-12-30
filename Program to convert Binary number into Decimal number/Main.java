import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Binary Number : ");
            int binaryNum = sc.nextInt();
            int ans = 0;
            for (int i = 1; binaryNum > 0; i *= 2) {
                int unit = binaryNum % 10;
                ans += (unit * (i));
                binaryNum /= 10;
            }
            System.out.println(ans);
        }
    }
}