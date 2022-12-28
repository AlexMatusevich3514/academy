package by.academy.homework3;

public class Bread extends Produсt {
    private String color;

    public Bread(String name, int quantity, double price, String color) {
        super(name, quantity, price);
        category = "Хлебобулочные изделия";
        this.color = color;
    }

    @Override
    protected double getDiscount() {
        if (quantity > 3) {
            return price * quantity / 100 * 10;
        } else {
            return 0;
        }
    }

    @Override
    protected double calcFinalPrise() {
        return price * quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ПРОДУКТ " + name + ". Цена за шт - " + price + " рублей.";
    }
}
