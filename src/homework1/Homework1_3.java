package homework1;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        String strNumber = String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);

        System.out.println(strNumber);
    }
}
