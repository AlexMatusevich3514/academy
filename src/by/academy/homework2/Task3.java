package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово с четным количеством букв:");
        String text1 = scanner.nextLine();
        System.out.println("Введите второе слово с четным количеством букв:");
        String text2 = scanner.nextLine();
        System.out.println(text1.substring(0,text1.length()/2)+text2.substring(text2.length()/2));
        scanner.close();
    }
}
