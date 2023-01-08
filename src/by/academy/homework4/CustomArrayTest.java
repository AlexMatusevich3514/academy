package by.academy.homework4;

//Task 3-4. Создать класс, который параметризуется любым типом (T).
//Написать свой итератор для массива.
// Что-то наподобие Итератора реализовал в цикле while (методы hasNext и next).

public class CustomArrayTest {
    public static void main(String[] args) {
        CustomArray<String> list = new CustomArray<String>(10);
        for (int i = 0; i < 20; i++) {
            list.add(Integer.toString(i));
        }
        list.print();
        System.out.println("Метод getFirst(). Первый элемент: " + list.getFirst());
        System.out.println("Метод getLast(). Последний элемент: " + list.getLast());
        System.out.println("Метод size(). Длина списка: " + list.size());
        System.out.println("Удаляем элемент под индексом \"" + list.remove(0) + "\"");
        System.out.println("Метод size(). Длина списка: " + list.size());
        System.out.println("Вывод на экран с помощью CustomIterator:");
        while (list.hasNext()) {
            System.out.print(list.next() + ", ");
        }
    }
}
