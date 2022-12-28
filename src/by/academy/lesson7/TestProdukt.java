package by.academy.lesson7;

public class TestProdukt {
    public static void main(String[] args) {
        Produkt produkt = new Produkt();
        System.out.println(produkt.calcPrice(150, 2));
        System.out.println(produkt.discount());
        Chocolate chocolate = new Chocolate("Dark");
        Cheese cheese = new Cheese("Crem cheese", 15,1,2);
        FruitChokolate fruitChokolate = new FruitChokolate("lime");

    }
}
