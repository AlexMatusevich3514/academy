package by.academy.lesson9;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                p.print();
            }
            else continue;
        }
    }

    @Override
    public void print() {
        System.out.println("Magazine" + name);
    }
}
