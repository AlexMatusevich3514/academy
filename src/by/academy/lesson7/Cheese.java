package by.academy.lesson7;

public class Cheese extends Produkt{
    private int weight;

    public Cheese() {
    }

    public Cheese(String name, int price, int quantity, int weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
