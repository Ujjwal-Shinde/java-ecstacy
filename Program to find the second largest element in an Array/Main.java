import java.util.Scanner;

public class Main {
    static int largestElement(int[] array) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ans) {
                ans = array[i];
            }
        }
        return ans;
    }

    static int secondLargestElement(int[] array) {
        int largestElement = largestElement(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == largestElement) {
                array[i] = Integer.MIN_VALUE;
            }
        }
        int secondLargestElement = largestElement(array);
        return secondLargestElement;
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

            System.out.println("Second largest element in an Array: " + secondLargestElement(arr));

        }
    }
}
