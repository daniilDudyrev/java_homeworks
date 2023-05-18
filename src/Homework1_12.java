import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arr = new int[50];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("\nSelect:\n1)Sort by decreasing\n2)Sort by increasing\n");
        int choice = scanner.nextInt();

        sort(arr, choice);
    }

    public static void sort(int[] arr, int choice) {
        if (choice == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j + 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        if (choice == 2) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j + 1] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
