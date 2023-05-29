package homework1;

import java.util.Scanner;

public class Homework1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input metres: ");
        int metres = scanner.nextInt();

        System.out.println("Select which metric system to convert to: \n1)Miles\n2)Inches\n3)Yards\n");
        int answer = scanner.nextInt();

        final double MILES_RATIO = 0.00062137;
        final double INCHES_RATIO = 39.37;
        final double YARDS_RATIO = 1.093613;

        switch (answer) {
            case 1 -> System.out.println(metres * MILES_RATIO + " miles");
            case 2 -> System.out.println(metres * INCHES_RATIO + " inches");
            case 3 -> System.out.println(metres * YARDS_RATIO + " yards");
            default -> System.out.println("Error. Select from 1 to 3");
        }
    }
}
