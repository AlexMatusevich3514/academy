package by.academy.homework3;

import java.time.LocalDate;

public class Date {
    private LocalDate localDate;
    private LocalDate deadlineDate;

    public Date() {
        this.localDate = LocalDate.now();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Date{" +
                "localDate='" + localDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate deadlineDate = localDate.plusDays(10);
        System.out.println(deadlineDate);
    }
}
