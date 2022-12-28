package by.academy.lesson7;

public class Chocolate extends Produkt {
    protected String color;

    public Chocolate(){
        super();
    }
    public Chocolate(String color) {
        this.color = color;
    }

    public Chocolate(String name, int price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
