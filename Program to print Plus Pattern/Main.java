import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Odd No. for proper output : ");
            int row = sc.nextInt();
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row; j++) {
                    if (j == (row / 2) + 1 || i == (row / 2) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}