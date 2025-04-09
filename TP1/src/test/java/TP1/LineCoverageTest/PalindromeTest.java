package TP1.LineCoverageTest;


import Tp1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void shouldThrowExceptionWhenStrIsNull(){
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testPalindromeSimpleTrue() {
        assertTrue(Palindrome.isPalindrome("madam"));
    }

    @Test
    void testPalindromeWithSpacesAndCase() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testPalindromeEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testPalindromeSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("x"));
    }

    @Test
    void testPalindromeNullInput() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
        assertEquals("String must not be null", exception.getMessage());
    }


}