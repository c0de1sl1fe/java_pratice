package com.ykic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindromeTest1() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }
    @Test
    void isPalindromeTest2() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }
    @Test
    void isPalindromeTest3() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}