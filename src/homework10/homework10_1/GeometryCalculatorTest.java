package homework10.homework10_1;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GeometryCalculatorTest {
    @Test
    public void testCalculateTriangleArea() {
        double base = 5.0;
        double height = 3.0;
        double expectedArea = 7.5;

        double actualArea = GeometryCalculator.calculateTriangleArea(base, height);

        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalculateRectangleArea() {
        double length = 6.0;
        double width = 4.0;
        double expectedArea = 24.0;

        double actualArea = GeometryCalculator.calculateRectangleArea(length, width);

        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalculateSquareArea() {
        double side = 5.0;
        double expectedArea = 25.0;

        double actualArea = GeometryCalculator.calculateSquareArea(side);

        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testCalculateRhombusArea() {
        double diagonal1 = 8.0;
        double diagonal2 = 6.0;
        double expectedArea = 24.0;

        double actualArea = GeometryCalculator.calculateRhombusArea(diagonal1, diagonal2);

        assertEquals(expectedArea, actualArea, 0.0001);
    }
}
