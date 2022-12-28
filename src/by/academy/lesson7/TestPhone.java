package by.academy.lesson7;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("3752911111", "Nokia", 100);
        Phone phone3 = new Phone();
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall("Tom");
        phone1.receiveCall("Bob");
        phone1.receiveCall("Enot");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Tom", "1111111");
        phone1.sendMessage("1111", "22222", "33333");
    }
}
