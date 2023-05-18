import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input percent: ");
        double percent = scanner.nextDouble();

        System.out.print("Input number: ");
        double number = scanner.nextDouble();

        double result = (percent / 100) * number;

        System.out.print(percent + "% of " + number + " equal to " + result);
    }
}
