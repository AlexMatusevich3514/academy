package by.academy.homework5;
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//Замерьте время, которое потрачено на это.

//Уменьшил количество элементов, чтобы программа работала быстрее. Добавил метод по удалени. для сравнения.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static Random random = new Random();
    public static long timeMillisStart;
    public static long timeMillisEnd;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addList(arrayList);
        addList(linkedList);

        timeMillisStart = System.currentTimeMillis();
        choiceElement(arrayList);
        timeMillisEnd = System.currentTimeMillis();
        System.out.print("Время выполнения метода по обращению к элементу со списком ArrayList: ");
        System.out.println((timeMillisEnd - timeMillisStart) + " миллисекунд");

        timeMillisStart = System.currentTimeMillis();
        choiceElement(linkedList);
        timeMillisEnd = System.currentTimeMillis();
        System.out.print("Время выполнения метода по обращению к элементу со списком LinkedList: ");
        System.out.println((timeMillisEnd - timeMillisStart) + " миллисекунд");

        System.out.println("Время выполнения со списком Arraylist значительно быстрее, чем со списком " +
                "LinkedList т.к.идет доступ по индексу элемента. В LinkedList он проходит от начала или " +
                "конца до нужного элемента.");

        timeMillisStart = System.currentTimeMillis();
        deleteElement(arrayList);
        timeMillisEnd = System.currentTimeMillis();
        System.out.print("Время выполнения метода по удалению элемента со списком ArrayList: ");
        System.out.println((timeMillisEnd - timeMillisStart) + " миллисекунд");

        timeMillisStart = System.currentTimeMillis();
        deleteElement(linkedList);
        timeMillisEnd = System.currentTimeMillis();
        System.out.print("Время выполнения метода по удалению элемента со списком LinkedList: ");
        System.out.println((timeMillisEnd - timeMillisStart) + " миллисекунд");

        System.out.println("Удаление элементов ArrayList дольше, т.к. идет копирование нового списка и " +
                "сдвиг элементов, которые справа от удаляемого элемента. В LinkedList после удаления лишь " +
                "меняются ссылки связей соседних с удаляемым элементов.");

    }

    public static void addList(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i, 1);
        }
    }

    public static void choiceElement(List<Integer> list) {
        int index = list.size();
        for (int i = 0; i < 10000; i++) {
            list.get(random.nextInt(100000));
        }
    }

    public static void deleteElement(List<Integer> list) {
        for (int i = 0; i < 1000; i++) {
            list.remove(random.nextInt(1000 - i));
        }
    }
}
