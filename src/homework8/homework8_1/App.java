package homework8.homework8_1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        int count = 20;
        int[] numbers = new Random().ints(count, -100, 100).toArray();

        System.out.println(Arrays.toString(numbers));

        long positiveCount = IntStream.of(numbers)
                .filter(n -> n > 0)
                .count();

        long negativeCount = IntStream.of(numbers)
                .filter(n -> n < 0)
                .count();

        long twoDigitCount = IntStream.of(numbers)
                .filter(n -> n >= 10 && n <= 99)
                .count();

        long palindromeCount = IntStream.of(numbers)
                .filter(App::isPalindrome)
                .count();

        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Two-digit count: " + twoDigitCount);
        System.out.println("Palindrome count: " + palindromeCount);
    }

    private static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
