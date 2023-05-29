package homework1;

import java.util.Scanner;

public class Homework1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input direction(left, right, top, bottom): ");
        String direction = scanner.nextLine();

        System.out.print("\nInput length: ");
        int length = scanner.nextInt();

        System.out.print("\nInput symbol: ");
        char symbol = scanner.next().charAt(0);

        line(length, direction, symbol);
    }

    public static void line(int length, String direction, char symbol) {
        switch (direction) {
            case "left" -> {
                for (int i = 0; i <= length; i++) {
                    System.out.print(symbol);
                }
            }
            case "right" -> {
                for (int i = 0; i <= length; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i <= length; i++) {
                    System.out.print(symbol);
                }
            }
            case "top" -> {
                for (int i = 0; i <= length; i++) {
                    System.out.println(symbol);
                }
            }
            case "bottom" -> {
                for (int i = 0; i <= length; i++) {
                    System.out.println(" ");
                }
                for (int i = 0; i <= length; i++) {
                    System.out.println(symbol);
                }
            }
            default -> System.out.println("Invalid direction. Please enter 'left', 'right', 'top', or 'bottom'.");
        }
    }
}
