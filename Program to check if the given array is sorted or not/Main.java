import java.util.Scanner;

public class Main {
    static boolean sortedOrNOt(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
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

            System.out.println("The given array is sorted: " + sortedOrNOt(arr));

        }
    }
}