package com.ykic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {
    @Test
    public void testRomanToIntIIIEquals3() {
        assertEquals(3, RomanToInt.romanToInt("III"));
    }

    @Test
    public void testRomanToIntIVEquals4() {
        assertEquals(4, RomanToInt.romanToInt("IV"));
    }

    @Test
    public void testRomanToIntLVIIIEquals58() {
        assertEquals(58, RomanToInt.romanToInt("LVIII"));
    }
    @Test
    public void testRomanToIntMCMXCIVEqual1994() {
        assertEquals(1994,RomanToInt.romanToInt("MCMXCIV"));
    }
}