package homework6.homework6_3;

import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;
        int d = 12;

        //Нахождение максимума из четырех чисел
        Function<Integer, Function<Integer, Function<Integer, Function<Integer, Integer>>>> maxOfFour =
                num1 -> num2 -> num3 -> num4 -> Math.max(Math.max(num1, num2), Math.max(num3, num4));

        //Нахождение минимума из четырех чисел
        Function<Integer, Function<Integer, Function<Integer, Function<Integer, Integer>>>> minOfFour =
                num1 -> num2 -> num3 -> num4 -> Math.min(Math.min(num1, num2), Math.min(num3, num4));

        int max = maxOfFour.apply(a).apply(b).apply(c).apply(d);
        int min = minOfFour.apply(a).apply(b).apply(c).apply(d);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
