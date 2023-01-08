package by.academy.homework5;
//Можно писать все в main. Не нужно создавать новых классов.
//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("a");
        System.out.println("Начальная коллекция: " + list);
        System.out.println(customDeleteDublikate(list)); //вариант с методом через циклы. Вроде работает)
        //  System.out.println(setArray(list)); //вариант через преобразование в Set-коллекцию.
    }

    public static Collection<?> customDeleteDublikate(Collection<?> collection) {
        ArrayList<?> list = new ArrayList<>(collection);
        int index = list.size();
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    index--;
                }
            }
        }
        return list;
    }

    public static HashSet<?> setArray(Collection<?> collection) {
        return new HashSet<>(collection);
    }
}
