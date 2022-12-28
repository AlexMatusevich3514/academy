package by.academy.lesson6;

public class Task5 {

    public static void main(String[] args) {
        String str = " Hey      There!     How      Are you doing";
        System.out.println(str.trim().replaceAll("\\s+", " "));
    }
}
