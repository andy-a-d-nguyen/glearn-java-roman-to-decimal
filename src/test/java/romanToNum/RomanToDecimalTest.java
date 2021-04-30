package romanToNum;

import org.junit.jupiter.api.Test;
import romanToDecimal.RomanToDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalTest {

    @Test
    public void romanToDecimalTest() {

        int expected = 1;

        int result = RomanToDecimal.romanToDecimal("I");

        assertEquals(expected, result, "I equals 1");
    }

    @Test
    public void romanToDecimalTest2() {

        int expected = 5;

        int result = RomanToDecimal.romanToDecimal("V");

        assertEquals(expected, result, "V equals 5");
    }

    @Test
    public void romanToDecimalTest3() {

        int expected = 4;

        int result = RomanToDecimal.romanToDecimal("IV");

        assertEquals(expected, result, "IV equals 4");
    }

    @Test
    public void romanToDecimalTest4() {

        int expected = 2006;

        int result = RomanToDecimal.romanToDecimal("MMVI");

        assertEquals(expected, result, "MMVI equals 2006");
    }

    @Test
    public void romanToDecimalTest5() {

        int expected = 1944;

        int result = RomanToDecimal.romanToDecimal("MCMXLIV");

        assertEquals(expected, result, "MCMXLIV equals 1944");
    }

}