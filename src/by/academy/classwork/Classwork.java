package by.academy.classwork;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        //   for (int i = 10; i < 20; i++) {
        //       System.out.println(i * i);
        //  }
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int count = sc.nextInt();
        int g = 1;
        while (g < count) {
            sum = g * sum;
            g++;
        }
      //  System.out.println(sum);

        int minus = 0;
        int plus = 0;
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                plus += 1;
            } else if (a < 0) {
                minus += 1;
            } else if (a == 0) {
                zero += 1;
            }
        }
        System.out.println(minus);
        System.out.println(plus);
        System.out.println(zero);

    }
}

