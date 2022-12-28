package by.academy.lesson9.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2023, 1, 1);
        LocalDate localDate2 = LocalDate.of(2023, 1, 7);
        LocalDate localDate3 = LocalDate.of(2023, 3, 8);
        LocalDate localDate4 = LocalDate.of(2023, 12, 31);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy, MMMM,dd");
        System.out.println(dateTimeFormatter);
    }
}
