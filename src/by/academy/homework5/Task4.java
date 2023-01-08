package by.academy.homework5;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(11));
        }
        System.out.println(Arrays.deepToString(list.toArray()));
        Iterator<Integer> iterator = list.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int count = iterator.next();
            if (count > max) {
                max = count;
            }
        }
        System.out.println("Максимальная оценка - " + max);
    }
}

