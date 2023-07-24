package com.toyato.training;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate previousMonth = currentDate.minusMonths(1);
        String previousMonthName = previousMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Previous Month: " + previousMonthName);
    }
}
