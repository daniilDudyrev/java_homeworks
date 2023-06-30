package homework10.homework10_4;

public class LengthConverter {
    public static double convertMillimetersToCentimeters(double millimeters) {
        return millimeters / 10.0;
    }

    public static double convertCentimetersToMillimeters(double centimeters) {
        return centimeters * 10.0;
    }

    public static double convertCentimetersToMeters(double centimeters) {
        return centimeters / 100.0;
    }

    public static double convertMetersToCentimeters(double meters) {
        return meters * 100.0;
    }

    public static double convertMetersToKilometers(double meters) {
        return meters / 1000.0;
    }

    public static double convertKilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }
}
