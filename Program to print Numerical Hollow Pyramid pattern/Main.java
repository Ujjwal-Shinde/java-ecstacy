import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of Rows : ");
            int r = sc.nextInt();
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    if (i == 1 || k == 1 || i == r || k == i * 2 - 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}