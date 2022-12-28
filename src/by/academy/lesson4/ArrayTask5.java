package by.academy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(6);
            array2[i] = random.nextInt(6);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        double a1 = (double) sum1 / array1.length;
        double a2 = (double) sum2 / array2.length;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 > a2 ? "a1>a2" : "a1<a2");
    }
}

