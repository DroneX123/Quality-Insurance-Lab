package TP1.BranchCoverageTest;


import Tp1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void shouldThrowExceptionWhenStrIsNull(){
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }


}