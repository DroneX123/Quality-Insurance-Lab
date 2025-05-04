package org.example.ConditionCoverageTest;

import org.example.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("A"));
    }

    @Test
    void testTwoDifferentCharacters() {
        assertFalse(Palindrome.isPalindrome("ab"));
    }

    @Test
    void testUpperAndLowerCharacters() {
        assertTrue(Palindrome.isPalindrome("Aa")); // will be true after lowercase
    }

    @Test
    void testNullInputThrows() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
