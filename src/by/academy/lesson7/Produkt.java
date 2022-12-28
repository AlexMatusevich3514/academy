package by.academy.lesson7;

public class Produkt {
    protected String name;
    protected int price;
    protected int quantity;

    protected int calcPrice(int price, int quantity) {
        return price * quantity;
    }
    protected int discount(){
        return 1;
    }

    public Produkt() {
    }

    public Produkt(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return quantity;
    }

    public void setCount(int count) {
        this.quantity = count;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
