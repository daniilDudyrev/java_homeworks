package homework10.homework10_2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CurrencyConverterTest {
    @Test
    public void testConvertDollarsToRubles() {
        double dollars = 100.0;
        double expectedRubles = 7400.0;

        double actualRubles = CurrencyConverter.convertDollarsToRubles(dollars);

        assertEquals(expectedRubles, actualRubles, 0.0001);
    }

    @Test
    public void testConvertEurosToRubles() {
        double euros = 50.0;
        double expectedRubles = 4450.0;

        double actualRubles = CurrencyConverter.convertEurosToRubles(euros);

        assertEquals(expectedRubles, actualRubles, 0.0001);
    }

    @Test
    public void testConvertPoundsToRubles() {
        double pounds = 30.0;
        double expectedRubles = 3030.0;

        double actualRubles = CurrencyConverter.convertPoundsToRubles(pounds);

        assertEquals(expectedRubles, actualRubles, 0.0001);
    }

    @Test
    public void testConvertYenToRubles() {
        double yen = 5000.0;
        double expectedRubles = 3350.0;

        double actualRubles = CurrencyConverter.convertYenToRubles(yen);

        assertEquals(expectedRubles, actualRubles, 0.0001);
    }
}
