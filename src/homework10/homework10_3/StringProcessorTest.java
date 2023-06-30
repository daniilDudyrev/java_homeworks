package homework10.homework10_3;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class StringProcessorTest {
    @Test
    public void testIsPalindrome() {
        String palindrome = "level";
        String notPalindrome = "hello";

        assertTrue(StringProcessor.isPalindrome(palindrome));
        assertFalse(StringProcessor.isPalindrome(notPalindrome));
    }

    @Test
    public void testCountVowels() {
        String str = "Hello World";
        int expectedCount = 3;

        int actualCount = StringProcessor.countVowels(str);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountConsonants() {
        String str = "Hello World";
        int expectedCount = 7;

        int actualCount = StringProcessor.countConsonants(str);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountWordOccurrences() {
        String str = "Hello Hello World";
        String word = "Hello";
        int expectedCount = 2;

        int actualCount = StringProcessor.countWordOccurrences(str, word);

        assertEquals(expectedCount, actualCount);
    }
}