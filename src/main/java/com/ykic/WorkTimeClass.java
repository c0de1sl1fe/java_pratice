package com.ykic;

import java.time.LocalDate;

public class WorkTimeClass {
    public static boolean isWeekend(LocalDate date) {
        if(date.getMonthValue()!=5 || date.getYear()!=2024) {
            throw new IllegalArgumentException();
        }
        int dayOfWeek = date.getDayOfWeek().getValue();
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            return true;
        } else {
            int day = date.getDayOfMonth();
            int month = date.getMonthValue();
            if (month == 5) {
                return day == 1 || day == 2 || day == 9 || day == 10 || day == 11 || day == 12 || day == 19 || day == 25 || day == 26;
            }
            return false; // Рабочий день
        }
    }

    public static void main(String[] args) {
        LocalDate testDate = LocalDate.of(2024, 5, 1);
        System.out.println("Is " + testDate + " a weekend? " + isWeekend(testDate));
    }
}
