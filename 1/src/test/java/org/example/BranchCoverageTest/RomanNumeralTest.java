package org.example.BranchCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    @Test
    void testExactMultiples() {
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("C", RomanNumeral.toRoman(100));
    }

    @Test
    void testMultipleSymbols() {
        assertEquals("XXVII", RomanNumeral.toRoman(27));
    }

    @Test
    void testBoundaryValues() {
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }

    @Test
    void testBelowMinimumThrows() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-5));
    }
}
