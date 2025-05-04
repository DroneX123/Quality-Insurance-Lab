package org.example.BranchCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testPalindromeWithSpacesAndCase() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    void testOddLengthPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    void testNotPalindrome_Mismatch() {
        assertFalse(Palindrome.isPalindrome("chat"));
    }

    @Test
    void testNullThrows() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
