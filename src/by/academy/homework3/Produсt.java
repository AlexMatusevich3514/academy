package by.academy.homework3;

public abstract class Produсt {
    String name;
    int quantity;
    double price;
    String category;

    public Produсt() {
    }

    public Produсt(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    protected double priceProdukt() {
        return quantity * price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    protected abstract double getDiscount();

    protected abstract double calcFinalPrise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
