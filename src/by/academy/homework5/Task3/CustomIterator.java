package by.academy.homework5.Task3;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator<T> {
    private T[][] array;
    private int a;
    private int b;

    public CustomIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return a < array.length && b < array[a].length;
    }

    @Override
    public T next() {
        T element = array[a][b++];
        if (b >= array[a].length) {
            a++;
            b = 0;
        }
        return element;
    }
}
