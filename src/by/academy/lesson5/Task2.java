package by.academy.lesson5;

public class Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder sb = new StringBuilder();
        String text1 = (a + "+" + b + "=" + (a + b));
        System.out.println(sb.append(text1));
        int index1 = sb.indexOf("=");
        //  sb = sb.replace(index1,index1+"=".length(), "равно");
        //  System.out.println(sb);
        sb=sb.deleteCharAt(index1);
        System.out.println(sb);
        sb=sb.insert(index1, " равно ");
        System.out.println(sb);
    }
}
