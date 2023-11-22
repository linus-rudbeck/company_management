import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import se.distansakademin.Utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 7, 11, 711, -5, -51})
    public void testNumberIsOddTrue(int number) {
        var expected = true;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -8, -512})
    public void testNumberIsOddFalse(int number) {
        var expected = false;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   ", " "})
    @NullAndEmptySource
    public void testStringIsBlankTrue(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "lin us ", "  aws", "jaws"})
    public void testStringIsBlankFalse(String input){
        var expected = false;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testStringIsBlankNull(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 15, 25, 30, -1})
    public void testGetNoiseLevelLow(int decibel){
        var expected = Utilities.Level.LOW;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {70, 85, 1337, 90})
    public void testGetNoiseLevelHigh(int decibel){
        var expected = Utilities.Level.HIGH;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {45, 55, 38, 67})
    public void testGetNoiseLevelMedium(int decibel){
        var expected = Utilities.Level.MEDIUM;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"tEsT:test", "TEST:test", "test:test", "Test:test"}, delimiter = ':')
    public void testMakeStringLowercase(String input, String expected){
        var actual = Utilities.makeStringLowercase(input);

        assertEquals(expected, actual);
    }
}
