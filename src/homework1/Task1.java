package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int discount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму покупки:");
        int sum = sc.nextInt();
        System.out.println("Введите возраст покупателя:");
        byte age = sc.nextByte();
        if (sum < 100) {
            sum = (sum - (sum / 100 * 5));
            discount = 5;
        } else if (sum >= 100 && sum < 200) {
            sum = (sum - (sum / 100 * 7));
            discount = 7;
        } else if (sum >= 200 && sum < 300) {
            if (age > 18) {
                sum = (sum - (sum / 100 * (12 + 4)));
                discount = 16;
            } else {
                sum = (sum - (sum / 100 * (12 - 3)));
                discount = 9;
            }
        } else if (sum >= 300 && sum < 400) {
            sum = (sum - (sum / 100 * 15));
            discount = 15;
        } else if (sum >= 400) {
            sum = (sum - (sum / 100 * 20));
            discount = 20;
        }
        System.out.println("Сумма покупки со скидкой составила: " + sum + " рублей.");
        System.out.println("Сумма скидки: " + discount + " %");
        sc.close();
    }
}
