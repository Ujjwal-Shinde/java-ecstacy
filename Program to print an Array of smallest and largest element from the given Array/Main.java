import java.util.Scanner;

public class Main {
    static int[] smallestAndLargestElement(int[] array) {
        int[] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;
        ans[1] = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < ans[0]) {
                ans[0] = array[i];
            }
            if (array[i] > ans[1]) {
                ans[1] = array[i];
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

            int[] arr2 = smallestAndLargestElement(arr);
            System.out.println("Array consisting of smallest and largest element: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }

        }
    }
}
