package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String string1 = sc.nextLine();
        System.out.println("Введите строку 2:");
        String string2 = sc.nextLine();

        char[] charsString1 = string1.toCharArray();
        char[] charsString2 = string2.toCharArray();

        int str1 = 0;
        int str2 = 0;
        if (charsString1.length != charsString2.length) {
            result = false;
            System.out.println(result + "строки не равны");
        } else {
            for (int i = 0; i < charsString1.length; i++) {
                str1 += charsString1[i];
            }
            System.out.println("str1=" + str1);
            for (int j = 0; j < charsString2.length; j++) {
                str2 += charsString2[j];
            }
            System.out.println("str2=" + str2);
            if (str1 == str2) {
                result = true;
                System.out.println(result + " - строки равны");
            } else {
                result = false;
                System.out.println(result + " - строки не равны");
            }
        }
        sc.close();
    }
}
