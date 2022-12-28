package by.academy.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Chees chees1 = new Chees("Сыр Holland", 1, 30.0, "с плесенью", 0.35);
        Chees chees2 = new Chees("Сыр Swiss", 1, 15.0, "без плесени", 1);
        Bread bread1 = new Bread("Хлеб Кирпичик", 1, 2.5, "черный");
        Bread bread2 = new Bread("Хлеб Плетенка", 1, 4, "белый");
        Fish fish1 = new Fish("Рыба Карась", 1, 10.0, "Big");
        Fish fish2 = new Fish("Рыба Карп", 1, 15.0, "Big");
        Produсt[] produсtsarray = {chees1, chees2, bread1, bread2, fish1, fish2};

        Person seller = new Person("Кассир Галя", 50, 0);
        Person buyer = new Person();
        Deal deal = new Deal(buyer, seller);

        deal.addProduct(produсtsarray);
        deal.infoArray();
        deal.resultsum();
        deal.printcheck();
        Task3.formatDate();
        Validator validator = new BelarusPhoneValidator();
        Validator validator1 = new EmailValid();
        System.out.println("Проверка номера " + buyer.getPhoneNumber() + " на валидность - \n" +
                "" + validator.validate(buyer.getPhoneNumber()));
        System.out.println("Проверка eMail " + buyer.geteMail() + " на валидность - \n" +
                "" + validator1.validate(buyer.geteMail()));
        console.close();
    }
}
