package homework7.homework7_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\curve\\IdeaProjects\\java_homeworks\\src\\homework7\\homework7_3\\file.txt");
            Scanner scanner = new Scanner(file);

            int[][] arrays = readArrays(scanner);
            displayArrays(arrays);
            displayMinMaxSum(arrays);
            displayOverallMinMaxSum(arrays);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    private static int[][] readArrays(Scanner scanner) {
        int[][] arrays = null;
        int rowCount = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int[] array = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            if (arrays == null) {
                arrays = new int[1][];
            } else {
                int[][] temp = new int[arrays.length + 1][];
                System.arraycopy(arrays, 0, temp, 0, arrays.length);
                arrays = temp;
            }

            arrays[rowCount++] = array;
        }

        return arrays;
    }

    private static void displayArrays(int[][] arrays) {
        System.out.println("Arrays:");
        for (int[] array : arrays) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void displayMinMaxSum(int[][] arrays) {
        for (int[] array : arrays) {
            int min = array[0];
            int max = array[0];
            int sum = 0;

            for (int element : array) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
                sum += element;
            }

            System.out.println("Array: " + arrayToString(array));
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("Sum: " + sum);
            System.out.println();
        }
    }

    private static void displayOverallMinMaxSum(int[][] arrays) {
        int overallMin = arrays[0][0];
        int overallMax = arrays[0][0];
        int overallSum = 0;

        for (int[] array : arrays) {
            for (int element : array) {
                if (element < overallMin) {
                    overallMin = element;
                }
                if (element > overallMax) {
                    overallMax = element;
                }
                overallSum += element;
            }
        }

        System.out.println("Overall Min: " + overallMin);
        System.out.println("Overall Max: " + overallMax);
        System.out.println("Overall Sum: " + overallSum);
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
