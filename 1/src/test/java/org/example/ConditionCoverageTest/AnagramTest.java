package org.example.ConditionCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    void testBothNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, null));
    }

    @Test
    void testFirstNullOnly() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "word"));
    }

    @Test
    void testSecondNullOnly() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("word", null));
    }

    @Test
    void testSameLengthSameLettersDifferentOrder() {
        assertTrue(Anagram.isAnagram("evil", "vile"));
    }

    @Test
    void testSameLengthSameLettersSameOrder() {
        assertTrue(Anagram.isAnagram("tone", "note")); // les mêmes lettres, ordre différent
    }
}
