package homework1;

import java.util.Scanner;

public class Homework1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        int temp;

        if (firstNumber > secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        System.out.println("Odd numbers in range " + firstNumber + "-" + secondNumber);
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
