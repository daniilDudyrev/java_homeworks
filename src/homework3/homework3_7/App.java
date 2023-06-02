package homework3.homework3_7;

public class App {
    public static void main(String[] args) {
        int[] numbers = {3, 6, -1, 1, 7, 2};
        Array array = new Array(numbers);

        System.out.println("Array:");
        array.PrintArray();

        System.out.println("Ascending array:");
        array.SortAsc();
        array.PrintArray();

        System.out.println("Descending array:");
        array.SortDesc();
        array.PrintArray();
    }
}
