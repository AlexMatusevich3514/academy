package by.academy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int max;
        int min;
        int[][] array2 = new int[5][2];
        for (int i = 0; i < array.length; i++) {
             max = array[i][0];
             min = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > min && array[i][j] < max){
                    continue;}
                else if (max < array[i][j]) {
                    max = array[i][j];
                } else if (min > array[i][j]){
                    min = array[i][j];
                }
            }
            array2[i][0] = min;
            array2[i][1] = max;
        }
        System.out.println(Arrays.deepToString(array2));
        int [] array3 = new int[8];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if(array3[i]%2!=0)
                array3[i]=0;
        }
        System.out.println(Arrays.toString(array3));
    }
}
