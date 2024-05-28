package com.ykic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"ab","a"}));

    }
}