package homework10.homework10_4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LengthConverterTest {
    @Test
    public void testConvertMillimetersToCentimeters() {
        double millimeters = 50.0;
        double expectedCentimeters = 5.0;

        double actualCentimeters = LengthConverter.convertMillimetersToCentimeters(millimeters);

        assertEquals(expectedCentimeters, actualCentimeters, 0.0001);
    }

    @Test
    public void testConvertCentimetersToMillimeters() {
        double centimeters = 5.0;
        double expectedMillimeters = 50.0;

        double actualMillimeters = LengthConverter.convertCentimetersToMillimeters(centimeters);

        assertEquals(expectedMillimeters, actualMillimeters, 0.0001);
    }

    @Test
    public void testConvertCentimetersToMeters() {
        double centimeters = 100.0;
        double expectedMeters = 1.0;

        double actualMeters = LengthConverter.convertCentimetersToMeters(centimeters);

        assertEquals(expectedMeters, actualMeters, 0.0001);
    }

    @Test
    public void testConvertMetersToCentimeters() {
        double meters = 2.0;
        double expectedCentimeters = 200.0;

        double actualCentimeters = LengthConverter.convertMetersToCentimeters(meters);

        assertEquals(expectedCentimeters, actualCentimeters, 0.0001);
    }

    @Test
    public void testConvertMetersToKilometers() {
        double meters = 5000.0;
        double expectedKilometers = 5.0;

        double actualKilometers = LengthConverter.convertMetersToKilometers(meters);

        assertEquals(expectedKilometers, actualKilometers, 0.0001);
    }

    @Test
    public void testConvertKilometersToMeters() {
        double kilometers = 5.0;
        double expectedMeters = 5000.0;

        double actualMeters = LengthConverter.convertKilometersToMeters(kilometers);

        assertEquals(expectedMeters, actualMeters, 0.0001);
    }
}