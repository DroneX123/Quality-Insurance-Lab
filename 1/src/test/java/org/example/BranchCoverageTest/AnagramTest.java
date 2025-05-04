package org.example.BranchCoverageTest;

import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    void testAnagramIgnoreCase() {
        assertTrue(Anagram.isAnagram("Listen", "Silent")); // casse différente
    }

    @Test
    void testSameLengthButNotAnagram() {
        assertFalse(Anagram.isAnagram("abcd", "abce")); // même taille mais lettres différentes
    }

    @Test
    void testNullSecondString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testSameString() {
        assertTrue(Anagram.isAnagram("loop", "pool")); // permutation simple
    }
}
