package by.academy.lesson4;

import java.util.Arrays;

public class ArrayTask2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                a++;
            }
        }
        int j = 0;
        int[] array = new int[a];
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                array[j] = i;
                j++;
            } else {
                continue;
            }
        }
       System.out.println(Arrays.toString(array));

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + ", ");
        }

    }
}
