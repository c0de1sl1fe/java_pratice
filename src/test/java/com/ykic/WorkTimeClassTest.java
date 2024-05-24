package com.ykic;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class WorkTimeClassTest {
    @Test
    public void testTime(){
        assertEquals (WorkTimeClass.isWeekend(LocalDate.of(2024, 5, 4)), true);
        assertEquals (WorkTimeClass.isWeekend(LocalDate.of(2024, 5, 22)), false);
        assertThrows(IllegalArgumentException.class, () -> WorkTimeClass.isWeekend(LocalDate.of(2025,1,5)));

    }
}