package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    static Pattern pattern = Pattern.compile("\\s+");

    public static void main(String[] args) {
        String text = " Строка с   текстом ";

        Matcher matcher = pattern.matcher(text.trim());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
