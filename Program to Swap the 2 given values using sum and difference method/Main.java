import java.util.Scanner;

public class Main {
    static void swap(int a, int b) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            swap(a, b);

        }
    }
}
