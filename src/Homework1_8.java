import java.util.Scanner;

public class Homework1_8 {
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

        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + i * j + "  ");
            }
            System.out.println("\n..........................................................................................................\n");
        }
    }
}
