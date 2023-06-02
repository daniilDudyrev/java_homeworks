package homework4.homework4_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

class Array<T extends Comparable<T>> {
    private T[] arr;

    public Array(int size) {
        arr = (T[]) new Comparable[size];
    }

    public void fillFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = (T) scanner.next();
        }
    }

    public void fillWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (T) Integer.valueOf(random.nextInt(-100,100));
        }
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }

    public T findMax() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public T findMin() {
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public double calculateAverage() {
        double sum = 0;
        for (T num : arr) {
            sum += Double.parseDouble(num.toString());
        }
        return sum / arr.length;
    }

    public void sortAscending() {
        Arrays.sort(arr);
    }

    public void sortDescending() {
        Arrays.sort(arr, Comparator.reverseOrder());
    }

    public int binarySearch(T value) {
        return Arrays.binarySearch(arr, value);
    }

    public void replaceValue(T oldValue, T newValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldValue)) {
                arr[i] = newValue;
            }
        }
    }
}
