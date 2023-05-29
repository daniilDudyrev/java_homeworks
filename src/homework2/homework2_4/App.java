package homework2.homework2_4;

public class App {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        Fraction result1 = fraction1.add(fraction2);
        result1.print();

        Fraction result2 = fraction1.add(2);
        result2.print();
    }
}
