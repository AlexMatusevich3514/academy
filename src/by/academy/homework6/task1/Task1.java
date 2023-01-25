package by.academy.homework6.task1;
//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
//если введена "stop" строка тогда закончить запись в файл.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task1\\fileTask1.txt";

        System.out.println("Вводите текст с клавиатуры. Программа остановит запись после слова \"stop\":");
        try (FileWriter writer = new FileWriter(path, false); Scanner scanner = new Scanner(System.in);) {
            while (true) {
                String text = scanner.nextLine();
                if (text.equals("stop")) {
                    break;
                } else {
                    writer.write(text + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
