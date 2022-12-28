package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Person {
    private String name;
    private int age;
    private double money;
    private String phoneNumber = "+375293514054";
    private String eMail = "email123@valid.by";

    Scanner console = new Scanner(System.in);

    public Person() {
        System.out.println("Добро пожаловать!");
        System.out.println("Введите свое имя");
        setName(console.nextLine());
        System.out.println("Введите ваш возраст");
        setAge(console.nextInt());
        System.out.println("Введите количество денег на вашем кошельке");
        setMoney(console.nextDouble());
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Неверный возраст. Возраст будет установлен по умолчанию - 1 год.");
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public double getMoney() {
        return money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setMoney(double money) {
        if (money <= 0) {
            System.out.println("C таким количеством денег ничего не купить.");
            System.out.println("Магазин безвозмездно начислит вам 100 рублей. Потом отдадите)");
            System.out.println("Приступайте к покупкам ->>");
            this.money = 100;
        } else {
            this.money = money;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

}

