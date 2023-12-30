import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Number : ");
            int num = sc.nextInt();
            int original_num = num;
            int numOfDigits = 0;
            while (num > 0) {
                num /= 10;
                numOfDigits++;
            }
            System.out.println("Number of digits in "+ original_num + " = " + numOfDigits);
        }
    }
}