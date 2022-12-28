package by.academy.lesson4;

import java.util.Arrays;

public class ArrayWork1 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0)
                a++;
        }
        int g = 0;
        System.out.println(a);
        int[] array = new int[a];
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[g] = i;
                System.out.print(array[g] + " ");}
            else
            {continue;}
                g++;

            }
        System.out.println(Arrays.toString(array));
        }

    }

