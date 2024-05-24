package com.ykic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeClassTest {
    @Test
    public void testSleepId() {
        assertEquals(PracticeClass.sleepIn(false, false), true);
    }

    @Test
    public void testSleepId1() {
        assertEquals(PracticeClass.sleepIn(true, false), false);
    }

    @Test
    public void testSleepId2() {
        assertEquals(PracticeClass.sleepIn(false, true), true);
    }
}