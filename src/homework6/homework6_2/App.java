package homework6.homework6_2;

import java.util.function.BiFunction;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}

public class App {
    public static void main(String[] args) {
        //Сложение двух дробей
        BiFunction<Fraction, Fraction, Fraction> addition = (fraction1, fraction2) -> {
            int numerator = fraction1.getNumerator() * fraction2.getDenominator()
                    + fraction2.getNumerator() * fraction1.getDenominator();
            int denominator = fraction1.getDenominator() * fraction2.getDenominator();
            return new Fraction(numerator, denominator);
        };

        //Вычитание двух дробей
        BiFunction<Fraction, Fraction, Fraction> subtraction = (fraction1, fraction2) -> {
            int numerator = fraction1.getNumerator() * fraction2.getDenominator()
                    - fraction2.getNumerator() * fraction1.getDenominator();
            int denominator = fraction1.getDenominator() * fraction2.getDenominator();
            return new Fraction(numerator, denominator);
        };

        //Умножение двух дробей
        BiFunction<Fraction, Fraction, Fraction> multiplication = (fraction1, fraction2) -> {
            int numerator = fraction1.getNumerator() * fraction2.getNumerator();
            int denominator = fraction1.getDenominator() * fraction2.getDenominator();
            return new Fraction(numerator, denominator);
        };

        //Деление двух дробей
        BiFunction<Fraction, Fraction, Fraction> division = (fraction1, fraction2) -> {
            int numerator = fraction1.getNumerator() * fraction2.getDenominator();
            int denominator = fraction1.getDenominator() * fraction2.getNumerator();
            return new Fraction(numerator, denominator);
        };

        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);

        Fraction add = addition.apply(fraction1, fraction2);
        Fraction sub = subtraction.apply(fraction1, fraction2);
        Fraction mult = multiplication.apply(fraction1, fraction2);
        Fraction div = division.apply(fraction1, fraction2);

        System.out.println("Addition: " + add.getNumerator() + "/" + add.getDenominator());
        System.out.println("Subtraction: " + sub.getNumerator() + "/" + sub.getDenominator());
        System.out.println("Multiplication: " + mult.getNumerator() + "/" + mult.getDenominator());
        System.out.println("Division: " + div.getNumerator() + "/" + div.getDenominator());
    }
}
