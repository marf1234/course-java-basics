package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.util.Date;

public class Date_Wrapper {
    public static void main(String[] args) {
    LocalDate now=LocalDate.now();
    LocalDate localDate = now.plusMonths(1);
    System.out.println(localDate);
    }

}
