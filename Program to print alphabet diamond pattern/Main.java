import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int num = 0;
            int alphabet = 65;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= (row - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i * 2 - 1); j++) {
                    System.out.print((char) (alphabet + num++));
                }
                System.out.println();
                num = 0;
            }
            for (int i = 2; i <= row; i++) {
                for (int j = 1; j <= (i - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= (row - i) * 2; j++) {
                    System.out.print((char) (alphabet + num++));
                }
                System.out.println();
                num = 0;
            }
        }
    }
}