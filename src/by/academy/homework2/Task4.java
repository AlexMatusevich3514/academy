package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Вынужден признаться, решение этой задачи подсмотрел)
// Логику понял, но сам бы вряд ли решил. Или очень долго решал бы.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suit = {"Червы", "Бубны", "Крест", "Пика"};
        String[] number = {"6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int numberOfCards = suit.length * number.length;
        String[] desk = new String[numberOfCards];
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                desk[suit.length * j + i] = suit[i] + " " + number[j];
            }
        }
        Random random = new Random();
        for (int i = 0; i < desk.length; i++) {
            int index = random.nextInt(i + 1);
            String a = desk[index];
            desk[index] = desk[i];
            desk[i] = a;
        }
        System.out.println(Arrays.toString(desk));
        System.out.println("Введите количество игроков от 2 до 5:");
        int player = scanner.nextInt();
        int limitCard = 5;
        for (int i = 0; i < limitCard * player; i++) {
            System.out.print(desk[i] + ", ");
            if (i % limitCard == limitCard - 1) {
                System.out.println("\n");
            }
        }
        scanner.close();
    }
}

