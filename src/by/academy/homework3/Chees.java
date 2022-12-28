package by.academy.homework3;

import java.io.Serializable;

public class Chees extends Produсt implements Serializable {
    public final static double DISCOUNT_WEIGHT = 1.0;
    private String view;
    private double weight;

    public Chees() {
        super();
    }

    public Chees(String name, int quantity, double price, String view, double weight) {
        super(name, quantity, price);
        category = "Сырный продукт";
        this.view = view;
        this.weight = weight;
    }

    @Override
    protected double getDiscount() {
        if (weight * quantity > DISCOUNT_WEIGHT) {
            return price * weight * quantity / 100 * 10;
        } else {
            return 0;
        }
    }

    @Override
    protected double calcFinalPrise() {
        return weight * price * quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "ПРОДУКТ " + name + ". Цена за шт - " + price + " рублей.";
    }
}
