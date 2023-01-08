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

        int[] symbol = new int[65536];
        for (int i = 0; i < text.length(); i++) {
            int a = symbol[text.charAt(i)];
            symbol[text.charAt(i)] = a + 1;
        }

        for (int i = 0; i < 65536; i++) {
            if (symbol[i] > 0) {
                map.put((char) i, symbol[i]);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Символ \"" + entry.getKey() + "\" - " + entry.getValue() + " штук");
        }
        scanner.close();
    }
}
