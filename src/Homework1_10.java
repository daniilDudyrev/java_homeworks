import java.util.Arrays;
import java.util.Random;

public class Homework1_10 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));


        int[] evenNumbers = new int[]{};
        int[] oddNumbers = new int[]{};
        int[] negativeNumbers = new int[]{};
        int[] positiveNumbers = new int[]{};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = arr[i];
            }
            if (arr[i] % 2 != 0) {
                oddNumbers = Arrays.copyOf(oddNumbers, oddNumbers.length + 1);
                oddNumbers[oddNumbers.length - 1] = arr[i];
            }
            if (arr[i] < 0) {
                negativeNumbers = Arrays.copyOf(negativeNumbers, negativeNumbers.length + 1);
                negativeNumbers[negativeNumbers.length - 1] = arr[i];
            }
            if (arr[i] > 0) {
                positiveNumbers = Arrays.copyOf(positiveNumbers, positiveNumbers.length + 1);
                positiveNumbers[positiveNumbers.length - 1] = arr[i];
            }
        }

        System.out.println("Even numbers array: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers array: " + Arrays.toString(oddNumbers));
        System.out.println("Negative numbers array: " + Arrays.toString(negativeNumbers));
        System.out.println("Positive numbers array: " + Arrays.toString(positiveNumbers));
    }
}
