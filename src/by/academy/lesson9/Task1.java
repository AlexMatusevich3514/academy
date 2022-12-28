package by.academy.lesson9;
//1.	а) Определить интерфейс Printable, содержащий метод void print().
//       б) Определить класс Book, реализующий интерфейс Printable.
//      в) Определить класс Magazine, реализующий интерфейс Printable.
//      г) Создать массив типа Printable, который будет содержать книги и журналы.
//        д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.  Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.


public class Task1 {
    public static void main(String[] args) {
        Printable[] printable = new Printable[5];
        printable[0] = new Book("Конек-горбунок");
        printable[1] = new Book("Илья-Муромец");
        printable[2] = new Book("Иван-дурак");
        printable[3] = new Magazine("Журнал1");
        printable[4] = new Magazine("Журнал2");
        for (Printable p : printable) {
            p.print();
        }
        System.out.println("__________________");
        Book.printBooks(printable);
        Magazine.printMagazines(printable);

    }
}
