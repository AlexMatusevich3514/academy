package by.academy.homework3;

public class TestPhone {
    public static void main(String[] args) {
        Validator validator = new AmericanPhoneValidator();
        Validator validator1 = new BelarusPhoneValidator();
        Validator validator2 = new EmailValid();
        System.out.println("+375293514054 - " + validator1.validate("+375293514054"));
        System.out.println("fmdfg@mail.ru - " + validator2.validate("fmdfg@mail.ru"));

    }
}
