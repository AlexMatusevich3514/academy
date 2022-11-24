package by.academy.lesson2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a = 2_123_000;
        int b = 100;
        int c = 234;
        System.out.println(a / b * c);

        int i = 3;
        int j = 4;
        int k = 25;
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц:");
        String month = sc.nextLine();
        switch (month) {
            case ("январь"):
                System.out.println("1");
                break;
            case ("февраль"):
                System.out.println("2");
                break;
            case ("март"):
                System.out.println("3");
                break;
            case ("апрель"):
                System.out.println("4");
                break;
            case ("май"):
                System.out.println("5п");
                break;
            default:
                System.out.println("нет месяца");
                break;
        }

        int d = 7;
        System.out.println(( d % 2==0) ? "четное" : "нечетное");


    }
}

