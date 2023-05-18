import java.util.Scanner;

public class Homework1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 6-digit number: ");
        int number = scanner.nextInt();

        if(number >= 100000 && number <= 999999) {
            int firstDigit = (number / 100000) % 10;
            int secondDigit = (number / 10000) % 10;
            int fifthDigit = (number / 10) % 10;
            int sixthDigit = number % 10;

            int result = number - (firstDigit * 100000) - (secondDigit * 10000) - (fifthDigit * 10) - sixthDigit
                    + (sixthDigit * 100000) + (fifthDigit * 10000) + (secondDigit * 10) + firstDigit;

            System.out.println("Result: " + result);
        } else {
            System.out.println("Error! The number is not 6-digit");
        }
    }
}
