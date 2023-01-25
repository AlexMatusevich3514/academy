package by.academy.homework6.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) throws IOException {
        String dir = "C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task4\\files\\";
        File fileDir = new File("C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task4\\files");
        if (!fileDir.exists()) {
            fileDir.mkdir();
        }
        ArrayList<File> files = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            files.add(new File(fileDir, i + ".txt"));
            if (!files.get(i).exists()) {
                files.get(i).createNewFile();
            }
        }
        //читаем текст из задания 2 и сохранием в textTask2
        FileReader fileReader = new FileReader("C:\\Users\\User\\by.academy\\src\\by\\academy\\homework6\\task2\\fileTask2.txt");
        int c;
        StringBuilder textTask2 = new StringBuilder();
        while ((c = fileReader.read()) != -1) {
            textTask2.append((char) c);
        }

        File fileResult = new File(dir, "result.txt");
        if (!fileResult.exists()) {
            fileResult.createNewFile();
        }
        Random random = new Random();
        //записываем текст рандомной длины в файлы от 0 до 99 включительно
        //записывае информацию о файлах в файл result.txt
        try (FileWriter fwResult = new FileWriter(dir + "result.txt", false)) {
            for (int i = 0; i < 100; i++) {
                String nameFile = dir + i + ".txt";
                try (FileWriter fileWriter = new FileWriter(nameFile, false)) {
                    String textWriter = textTask2.substring(0, random.nextInt(textTask2.length()));
                    fileWriter.write(textWriter);
                    fileWriter.flush();
                    String textResSave = i + ".txt" + ". Символов: " + textWriter.length() +
                            ". Размер файла: " + files.get(i).length() + " байт.\n";
                    fwResult.write(textResSave);
                }
            }
        }
    }
}