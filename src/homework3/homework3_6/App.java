package homework3.homework3_6;

public class App {
    public static void main(String[] args) {
        int[] numbers = {3, 6, -1, 1, 7, 2};
        Array array = new Array(numbers);

        int max = array.Max();
        int min = array.Min();
        double avg = array.Avg();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);
    }
}
