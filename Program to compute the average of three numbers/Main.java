import java.util.Scanner;

public class Main {
    static int averageOfThreeNumbers(int a, int b, int c) {
        int ans = (a + b + c) / 3;
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three integers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            System.out.print("Average: ");
            System.out.println(averageOfThreeNumbers(num1, num2, num3));
        }
    }
}