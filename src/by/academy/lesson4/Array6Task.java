package by.academy.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Array6Task {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {1, 2, 3, 4};
        //     for (int i = 0; i < array.length; i++) {
        //      array[i] = random.nextInt(10, 100);
        //  }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i + 1]) {
                 if (array[i + 1] == array.length)
                {
                    System.out.println("В порядке возрастания");
                }
            } else
                System.out.println("не в порядке возрастания");
        }
    }
}
