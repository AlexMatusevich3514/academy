package by.academy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        char[][]array = new char[4][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) (100+i+j);
            }
        }
        System.out.println(Arrays.deepToString(array));

        Random random = new Random();
        int count = 0;
        int [] array2 = new int[15];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(9);
            if(array2[i] %2 ==0)
                count++;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(count);
    }
}
