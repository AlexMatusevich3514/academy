package by.academy.homework5.Task3;

import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        Integer[][] array = {{1, 2, 3},
                             {4, 5, 6, 7, 8}};
        CustomIterator customIterator = new CustomIterator(array);
        while (customIterator.hasNext()) {
            System.out.print(customIterator.next() + ", ");
        }
    }
}
