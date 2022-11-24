package by.academy.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s = 370_000;
        int sec;
        int m;
        int min;
        int h;
        int day;
        int week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        day = h / 24;
        week = day / 7;
        System.out.println(week + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");

        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число");
        int a = sc.nextInt();
        System.out.println("введите второе число");
        int b = sc.nextInt();
        System.out.println(a < b ? "число " + a+" меньше":"число " + b +" меньше");
        System.out.println("среднее арифмитическое равно" + ((a+b)/2));
        sc.close();
    }
}
