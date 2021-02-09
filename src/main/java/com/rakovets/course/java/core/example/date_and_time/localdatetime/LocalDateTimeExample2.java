package com.rakovets.course.java.core.example.date_and_time.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Year: " + year);
        System.out.println("Day in year: " + dayYear);
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + minute);
    }
}
