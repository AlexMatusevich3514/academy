package by.academy.lesson5;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String text = "I like Java";
        System.out.println(text.contains("Java"));
        System.out.println(text.indexOf("Java"));
        int index = text.lastIndexOf("Java");
        System.out.println(text.substring(index, index + "java".length()));

    }
}