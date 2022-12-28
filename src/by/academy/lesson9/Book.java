package by.academy.lesson9;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public static void printBooks(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Book) {
                p.print();
            }
            else continue;
        }
    }

    @Override
    public void print() {
        System.out.println("Book" + name);
    }
}
