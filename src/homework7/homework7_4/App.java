package homework7.homework7_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to file:");
        String filePath = scanner.nextLine();

        System.out.println("Enter an array of integers (space-separated):");
        String inputArray = scanner.nextLine();

        int[] array = parseArray(inputArray);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(inputArray + System.lineSeparator());

            String evenNumbers = getEvenNumbers(array);
            writer.write(evenNumbers + System.lineSeparator());

            String oddNumbers = getOddNumbers(array);
            writer.write(oddNumbers + System.lineSeparator());

            String reversedArray = reverseArray(array);
            writer.write(reversedArray + System.lineSeparator());

            System.out.println("Data has been written to the file successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }

    private static int[] parseArray(String inputArray) {
        String[] numbers = inputArray.split(" ");
        int[] array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        return array;
    }

    private static String getEvenNumbers(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int number : array) {
            if (number % 2 == 0) {
                sb.append(number).append(" ");
            }
        }

        return sb.toString().trim();
    }

    private static String getOddNumbers(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int number : array) {
            if (number % 2 != 0) {
                sb.append(number).append(" ");
            }
        }

        return sb.toString().trim();
    }

    private static String reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();

        for (int number : array) {
            sb.append(number).append(" ");
        }

        return sb.toString().trim();
    }
}
