import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int noOfTerms = sc.nextInt();
            int term1 = 1;
            int term2 = 1;
            int ans = 1;
            for (int i = 1; i <= noOfTerms; i++) {
                if (i == 1 || i == 2) {
                    System.out.println("1");
                } else {
                    ans = term1 + term2;
                    term1 = term2;
                    term2 = ans;
                    System.out.println(ans);
                }
            }
        }
    }
}