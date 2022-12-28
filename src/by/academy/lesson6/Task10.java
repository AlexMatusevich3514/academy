package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    static Pattern pattern = Pattern.compile("Java\\s+\\d+");

    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        text = text.trim().replaceAll("\\s+", " ");
        System.out.println(text);
        Matcher m = pattern.matcher(text);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);
    }
}
