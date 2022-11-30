package homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int count = sc.nextInt();
        if (count > 0 && count <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(count + " * " + i + " = " + count * i);
            }
        } else
            System.out.println("Введено неправильное число");
        sc.close();
    }
}
