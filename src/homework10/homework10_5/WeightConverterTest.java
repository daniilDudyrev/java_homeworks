package homework10.homework10_5;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class WeightConverterTest {
    @Test
    public void testConvertMilligramsToGrams() {
        double milligrams = 500.0;
        double expectedGrams = 0.5;

        double actualGrams = WeightConverter.convertMilligramsToGrams(milligrams);

        assertEquals(expectedGrams, actualGrams, 0.0001);
    }

    @Test
    public void testConvertGramsToMilligrams() {
        double grams = 0.5;
        double expectedMilligrams = 500.0;

        double actualMilligrams = WeightConverter.convertGramsToMilligrams(grams);

        assertEquals(expectedMilligrams, actualMilligrams, 0.0001);
    }

    @Test
    public void testConvertGramsToKilograms() {
        double grams = 1000.0;
        double expectedKilograms = 1.0;

        double actualKilograms = WeightConverter.convertGramsToKilograms(grams);

        assertEquals(expectedKilograms, actualKilograms, 0.0001);
    }

    @Test
    public void testConvertKilogramsToGrams() {
        double kilograms = 2.5;
        double expectedGrams = 2500.0;

        double actualGrams = WeightConverter.convertKilogramsToGrams(kilograms);

        assertEquals(expectedGrams, actualGrams, 0.0001);
    }

    @Test
    public void testConvertKilogramsToTons() {
        double kilograms = 5000.0;
        double expectedTons = 5.0;

        double actualTons = WeightConverter.convertKilogramsToTons(kilograms);

        assertEquals(expectedTons, actualTons, 0.0001);
    }

    @Test
    public void testConvertTonsToKilograms() {
        double tons = 5.0;
        double expectedKilograms = 5000.0;

        double actualKilograms = WeightConverter.convertTonsToKilograms(tons);

        assertEquals(expectedKilograms, actualKilograms, 0.0001);
    }
}