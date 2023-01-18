package by.academy.homework5;
//Имеется текст. Следует составить для него частотный словарь
// Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> map = new HashMap<>();

        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Символ \"" + entry.getKey() + "\" - " + entry.getValue() + " штук");
        }
        scanner.close();
    }
}
