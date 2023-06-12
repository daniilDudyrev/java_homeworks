package homework6.homework6_4;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Проверка на равенство конкретному числу
        Predicate<Integer> isEqualTo = num -> num == 5;

        //Проверка числа не входит в диапазон от A до B
        Predicate<Integer> isNotInRange = num -> num < 3 || num > 7;

        //Проверка положительности числа
        Predicate<Integer> isPositive = num -> num > 0;

        //Проверка отрицательности числа
        Predicate<Integer> isNegative = num -> num < 0;

        int sum1 = sumMatchingElements(numbers, isEqualTo);
        int sum2 = sumMatchingElements(numbers, isNotInRange);
        int sum3 = sumMatchingElements(numbers, isPositive);
        int sum4 = sumMatchingElements(numbers, isNegative);

        System.out.println("Sum of elements equal to 5: " + sum1);
        System.out.println("Sum of elements not in the range [3, 7]: " + sum2);
        System.out.println("Sum of positive elements: " + sum3);
        System.out.println("Sum of negative elements: " + sum4);
    }

    public static int sumMatchingElements(int[] numbers, Predicate<Integer> condition) {
        int sum = 0;
        for (int num : numbers) {
            if (condition.test(num)) {
                sum += num;
            }
        }
        return sum;
    }
}
