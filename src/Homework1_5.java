import java.util.Scanner;

public class Homework1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input month number(1-12): ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 2 || number == 12) {
            System.out.println("Winter");
        } else if (number >= 3 && number <= 5) {
            System.out.println("Spring");
        } else if (number >= 6 && number <= 8) {
            System.out.println("Summer");
        } else if (number >= 9 && number <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Error number is not in 1-12");
        }
    }
}
