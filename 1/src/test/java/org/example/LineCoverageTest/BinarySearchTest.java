package org.example.LineCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    void testValueFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testValueNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertFalse(BinarySearch.binarySearch(array, 6));
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        assertFalse(BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 2));
    }
}
