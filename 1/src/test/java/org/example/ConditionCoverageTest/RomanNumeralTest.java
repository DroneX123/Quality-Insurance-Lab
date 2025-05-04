package org.example.ConditionCoverageTest;

import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralTest {

    @Test
    void testMinimumAllowed() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testMaximumAllowed() {
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));
    }

    @Test
    void testLowerBoundaryFailure() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testUpperBoundaryFailure() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
