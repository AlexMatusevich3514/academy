package by.academy.homework3;

public class Fish extends Produсt {
    private String size;

    public Fish(String name, int quantity, double price, String size) {
        super(name, quantity, price);
        category = "Рыбы и консервы";
        this.size = size;
    }

    protected double getDiscount() {
        if (size.equalsIgnoreCase("big")) {
            return price * quantity / 100 * 10;
        } else {
            return 0;
        }
    }

    protected double calcFinalPrise() {
        return price * quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ПРОДУКТ " + name + ". Цена за шт - " + price + " рублей.";
    }
}
