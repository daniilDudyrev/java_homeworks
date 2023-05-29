package homework2_4;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {}

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction add(int number) {
        return add(new Fraction(number, 1));
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Error. Value can not be null.");
        }
    }
}
