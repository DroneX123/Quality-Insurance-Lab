package org.example.ConditionCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testAEqualZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 3, 2));
        assertEquals("a must not be zero", exception.getMessage());
    }

    @Test
    void testDeltaLessThanZero() {
        assertEquals("No real roots", QuadraticEquation.solve(1, 2, 3));
    }

    @Test
    void testDeltaEqualZero() {
        assertEquals("One root: -2.0", QuadraticEquation.solve(1, 4, 4));
    }

    @Test
    void testDeltaGreaterThanZero() {
        assertEquals("Two roots: 1.0 and -2.0", QuadraticEquation.solve(1, 1, -2));
    }
}
