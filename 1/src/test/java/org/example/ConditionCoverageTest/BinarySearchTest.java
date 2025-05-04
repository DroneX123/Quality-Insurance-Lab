package org.example.BranchCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    void testFirstElement() {
        int[] array = {1, 2, 3};
        assertTrue(BinarySearch.binarySearch(array, 1)); // test branche gauche
    }

    @Test
    void testLastElement() {
        int[] array = {1, 2, 3};
        assertTrue(BinarySearch.binarySearch(array, 3)); // test branche droite
    }

    @Test
    void testMiddleElement() {
        int[] array = {1, 2, 3};
        assertTrue(BinarySearch.binarySearch(array, 2)); // égalité
    }

    @Test
    void testValueTooSmall() {
        int[] array = {10, 20, 30};
        assertFalse(BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testValueTooBig() {
        int[] array = {10, 20, 30};
        assertFalse(BinarySearch.binarySearch(array, 50));
    }
}
