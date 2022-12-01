package lesson4.classwork;

import java.util.Scanner;

public class WorkString {
    public static void main(String[] args) {
        String text = "Для работы со строками в языке Java используются классы String,"
                + " StringBuilder, StringBuffer";
        System.out.println(text.indexOf("S"));

        int k = -1;
        do {
            k = text.indexOf('s', k + 1);
        }
        while (k >= 0);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        String[] text1 = new String[n];

        for (int i = 0; i < text1.length; i++) {
            text1[i] = sc.nextLine();
        }

        max = text1[0].length();
        for (int i = 0; i < text1.length; i++) {
            if (text1[i].length() > max) {
                max = text1[0].length();
            }
        }
    }
}



