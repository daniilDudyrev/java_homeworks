import java.util.Arrays;
import java.util.Random;

public class Homework1_9 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(-100, 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));


        int min = 0;
        int max = 0;

        int negativeCount = 0;
        int positiveCount = 0;

        int zeroCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < 0) {
                negativeCount++;
            }
            if(arr[i]>0) {
                positiveCount++;
            }
            if(arr[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println("\nMin: " + min + "  Max: " + max + "  Negative count: " + negativeCount + "  Positive count: " + positiveCount + "  zeroCount: " + zeroCount);
    }
}
