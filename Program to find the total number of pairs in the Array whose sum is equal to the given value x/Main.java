import java.util.Scanner;

public class Main {
    static int pairSum(int[] array, int x) {
        int ans = 0;
        for (int i = 0; i < (array.length) - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length of an Array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Given Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            System.out.println("Enter Target sum: ");
            int x = sc.nextInt();

            System.out.println("Total number of pair/s equal to target sum: " + pairSum(arr, x));

        }
    }
}
