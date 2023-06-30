package homework10.homework10_2;

public class CurrencyConverter {
    private static final double DOLLAR_TO_RUB_RATE = 74.0;
    private static final double EURO_TO_RUB_RATE = 89.0;
    private static final double POUND_TO_RUB_RATE = 101.0;
    private static final double YEN_TO_RUB_RATE = 0.67;

    public static double convertDollarsToRubles(double dollars) {
        return dollars * DOLLAR_TO_RUB_RATE;
    }

    public static double convertEurosToRubles(double euros) {
        return euros * EURO_TO_RUB_RATE;
    }

    public static double convertPoundsToRubles(double pounds) {
        return pounds * POUND_TO_RUB_RATE;
    }

    public static double convertYenToRubles(double yen) {
        return yen * YEN_TO_RUB_RATE;
    }
}