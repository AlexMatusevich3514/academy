package by.academy.homework4;

public enum DayOfTheWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5),
    SATURDAY(6), SUNDAY(7);
    private int dayNumber;

    DayOfTheWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}
