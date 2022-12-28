package by.academy.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //int a = sc.nextInt();
        String []text  = new String[2];
        for (int i = 0; i < text.length; i++) {
            text[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(text));
    }
}
