package org.example.BranchCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testTwoRealRoots() {
        assertEquals("Two roots: 3.0 and 2.0", QuadraticEquation.solve(1, -5, 6));
    }

    @Test
    void testOneRealRoot() {
        assertEquals("One root: -1.0", QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    void testNoRealRootsCase() {
        assertEquals("No real roots", QuadraticEquation.solve(2, 2, 5));
    }

    @Test
    void testExceptionWhenAZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
        assertEquals("a must not be zero", exception.getMessage());
    }
}
