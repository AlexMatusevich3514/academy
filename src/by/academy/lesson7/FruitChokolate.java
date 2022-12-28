package by.academy.lesson7;

public class FruitChokolate extends Chocolate{
    private String fruit;

    public FruitChokolate(String fruit) {
        this.fruit = fruit;
    }

    public FruitChokolate(String color, String fruit) {
        super(color);
        this.fruit = fruit;
    }

    public FruitChokolate(String name, int price, int quantity, String color, String fruit) {
        super(name, price, quantity, color);
        this.fruit = fruit;
    }
}
