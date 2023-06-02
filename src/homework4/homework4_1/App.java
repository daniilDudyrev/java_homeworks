package homework4.homework4_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Array<Integer> intArray = new Array<>(5);

        System.out.println("Fill array from keyboard:");
        intArray.fillFromKeyboard();
        intArray.display();

        System.out.println("Random array:");
        intArray.fillWithRandomNumbers();
        intArray.display();

        System.out.println("Enter a value to search in the array:");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();
        int index = intArray.binarySearch(searchValue);
        if (index >= 0) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found in the array");
        }

        System.out.println("Max value: " + intArray.findMax());
        System.out.println("Min value: " + intArray.findMin());
        System.out.println("Average: " + intArray.calculateAverage());

        System.out.println("Ascending array:");
        intArray.sortAscending();
        intArray.display();

        System.out.println("Descending array:");
        intArray.sortDescending();
        intArray.display();
    }
}
