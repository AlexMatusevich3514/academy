package by.academy.lesson10;

import by.academy.homework3.Chees;

public class Task6_test {
    public static void main(String[] args) {


        Task6_Generic<String, Chees, Integer> task6_generic = new Task6_Generic<>("сыр", new Chees(), 10);
        task6_generic.print();
    }
}
