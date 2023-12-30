import java.util.Scanner;

public class Main {
    static int[] reverseAnArray(int[] array) {
        int n = array.length;
        int[] reverseArray = new int[n];
        int i = n - 1;
        int j = 0;

        while (i >= 0) {
            reverseArray[j++] = array[i--];
        }

        return reverseArray;
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

            int[] reverseArray = reverseAnArray(arr);
            System.out.println("Reverse Array: ");
            for (int i = 0; i < reverseArray.length; i++) {
                System.out.print(reverseArray[i] + " ");
            }
        }
    }
}
