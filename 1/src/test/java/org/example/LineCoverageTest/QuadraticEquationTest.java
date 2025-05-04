package org.example.LineCoverageTest;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testTwoRoots() {
        assertEquals("Two roots: 2.0 and 1.0", QuadraticEquation.solve(1, -3, 2));
    }

    @Test
    void testOneRoot() {
        assertEquals("One root: 2.0", QuadraticEquation.solve(1, -4, 4));
    }

    @Test
    void testNoRealRoots() {
        assertEquals("No real roots", QuadraticEquation.solve(1, 2, 5));
    }
}
