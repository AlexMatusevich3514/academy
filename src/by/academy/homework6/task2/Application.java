package by.academy.homework6.task2;

import java.io.*;
import java.util.Scanner;

//Создать руками текстовый файл, закинуть следующий текст:
//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать
// текст в result.txt.

public class Application {
    public static void main(String[] args) {
        File fileOriginal = new File("C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task2\\fileTask2.txt");
        File fileResult = new File("C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task2\\result.txt");
        if (!fileResult.exists()) {
            try {
                fileResult.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (Scanner scanner = new Scanner(fileOriginal); FileWriter fileWriter = new FileWriter(fileResult);) {
            StringBuilder line = new StringBuilder();
            while (scanner.hasNext()) {
                line.append(scanner.nextLine());
            }
            line = new StringBuilder(line.toString().replaceAll("\\s", ""));
            fileWriter.write(line.toString());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

