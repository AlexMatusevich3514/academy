package by.academy.classwork;

import java.util.Arrays;
import java.util.Random;

public class ArrayClasswork {
    public static void main(String[] args) {
        String[] strings = new String[7];
        strings[0] = "Понедельник";
        strings[1] = "Вторник";
        strings[2] = "Среда";
        strings[3] = "Четверг";
        strings[4] = "Пятница";
        strings[5] = "Суббота";
        strings[6] = "Воскресенье";
        System.out.println(strings[strings.length - 1]);
        Random random = new Random();
        double[] doubles = new double[4];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = random.nextDouble();
        }
        System.out.println(doubles[0]);

        char a = 'a';
        String[][] deepString = new String[3][6];
        for (int i = 0; i < deepString.length; i++) {
            for (int j = 0; j < deepString[i].length; j++) {
                if (i == 0) {
                    deepString[i][j] = "'a'" + j;
                } else if (i == 1) {
                    deepString[i][j] = "'b'" + j;
                } else if (i == 2) {
                    deepString[i][j] = "'c'" + j;
                }
            }
        }
        System.out.println(Arrays.deepToString(deepString));
        char[][] chars = new char[4][2];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = 'i';
            }
        }
        System.out.println(Arrays.deepToString(chars));
    }
}
