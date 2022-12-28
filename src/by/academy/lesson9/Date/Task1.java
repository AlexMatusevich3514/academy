package by.academy.lesson9.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1987, 03, 05);
        System.out.println(localDate);
        int day = localDate.getDayOfMonth();
        int dayOfyear = localDate.getDayOfYear();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        System.out.println(localDate.isAfter(localDate1));
        System.out.println(localDate.isBefore(localDate1));
    }
}
