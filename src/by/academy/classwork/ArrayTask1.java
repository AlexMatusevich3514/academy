package by.academy.classwork;

import java.util.Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {

        int j = 0;
        int length = 0;
        for (int i = 2; i < 20; i++) {
            if (i % 2 == 0) {
                length++;
            }
        }
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            if (i >= 2 && i < 20 && i % 2 == 0) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}