package org.example.ConditionCoverageTest;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    void testNullArrayCondition() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 10));
    }

    @Test
    void testArrayWithOneElementFound() {
        int[] array = {7};
        assertTrue(BinarySearch.binarySearch(array, 7));
    }

    @Test
    void testArrayWithOneElementNotFound() {
        int[] array = {7};
        assertFalse(BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testConditionsLeftEqualsRight() {
        int[] array = {1, 3, 5, 7};
        assertTrue(BinarySearch.binarySearch(array, 1)); // force le cas left == right
    }
}
