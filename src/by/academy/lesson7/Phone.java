package by.academy.lesson7;

import java.util.Arrays;

public class Phone {
    String number = "No number";
    String model = "No name";
    int weight = 0;

    public Phone() {
    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номером " + number);
    }

    public void sendMessage(String... number) {
        System.out.println(Arrays.toString(number));
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
