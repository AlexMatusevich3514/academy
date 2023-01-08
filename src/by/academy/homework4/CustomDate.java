package by.academy.homework4;

import java.time.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomDate {
    public Year year;
    private Month month;
    private Day day;

    Scanner scanner = new Scanner(System.in);

    public CustomDate(String data) {
        this.year = new Year(Integer.parseInt(data.split("-")[0]));
        this.month = new Month(Integer.parseInt(data.split("-")[1]));
        this.day = new Day(Integer.parseInt(data.split("-")[2]));
    }

    public static boolean isValid(String data) {
        Pattern pattern = Pattern.compile("((19|20)\\d\\d)\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])");
        Matcher matcher = pattern.matcher(data);
        if (matcher.matches()) {
            System.out.println("Валидация формата даты пройдена.");
            return true;
        } else {
            System.out.println("Валидация формата даты не пройдена. Повторите ввод даты в формате \"yyyy-mm-dd\"");
            return false;
        }
    }

    public static void differenceDate(CustomDate customDate1, CustomDate customDate2) {
        LocalDateTime localDateTime1 = LocalDateTime.of(customDate1.getYear(), customDate1.getMonth(), customDate1.getDay(), 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(customDate2.getYear(), customDate2.getMonth(), customDate2.getDay(), 0, 0);
        long epohMinuten1 = localDateTime1.toEpochSecond(ZoneOffset.UTC);
        long epohMinuten2 = localDateTime2.toEpochSecond(ZoneOffset.UTC);
        long difDay = (Math.abs(epohMinuten1 - epohMinuten2)) / 86400;
        System.out.println("Разница между введенными датами составляет - " + difDay + " дней.");

    }

    public DayOfTheWeek dayOfTheWeek() {
        LocalDate localDate = LocalDate.of(getYear(), getMonth(), getDay());
        DayOfWeek day = localDate.getDayOfWeek();
        int numberDay = day.getValue();
        switch (numberDay) {
            case 1:
                return DayOfTheWeek.MONDAY;
            case 2:
                return DayOfTheWeek.TUESDAY;
            case 3:
                return DayOfTheWeek.WEDNESDAY;
            case 4:
                return DayOfTheWeek.THURSDAY;
            case 5:
                return DayOfTheWeek.FRIDAY;
            case 6:
                return DayOfTheWeek.SATURDAY;
            case 7:
                return DayOfTheWeek.SUNDAY;
            default:
                return null;
        }
    }

    public void isLeapYear() {
        if ((year.yearNumber % 4 == 0) && (year.yearNumber % 100 != 0) || (year.yearNumber % 400 == 0)) {
            System.out.println("Год - " + year.yearNumber + " високосный.");
        } else {
            System.out.println("Год - " + year.yearNumber + " не високосный.");
        }
    }

    public int getYear() {
        return year.yearNumber;
    }

    public int getMonth() {
        return month.monthNumber;
    }

    public int getDay() {
        return day.dayNumber;
    }

    private class Year {
        private int yearNumber;

        public Year(int data1) {
            yearNumber = data1;
        }
    }

    public class Month {
        private int monthNumber;

        public Month(int data2) {
            this.monthNumber = data2;
        }
    }

    public class Day {
        private int dayNumber;

        public Day(int data3) {
            this.dayNumber = data3;
        }
    }
}