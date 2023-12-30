import java.util.Scanner;

public class Main {
    static int numberOfOccurrences(int[] array, int x) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                ans++;
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
            System.out.println("Enter Number to be searched in an Array: ");
            int x = sc.nextInt();

            System.out.println("No of occurrence/s of a given element in an Array is: " + numberOfOccurrences(arr, x));

        }
    }
}