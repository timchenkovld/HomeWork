package homework9;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] values;
    private int pointer = 0;

    public MyQueue() {
        this.values = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(E item) {
        if (pointer == values.length - 1) {
            resize(values.length * 2);
        }
        values[pointer] = item;
        pointer++;
    }

    private void resize(int newLength) {
        Object[] newValues = new Object[newLength];
        System.arraycopy(values, 0, newValues, 0, pointer);
        values = (E[]) newValues;
    }

    public E poll() {
        if (pointer == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        E item = values[0];
        pointer--;
        System.arraycopy(values, 1, values, 0, pointer);
        values[pointer] = null;
        return item;
    }

    public E peek() {
        return values[0];
    }

    public int size() {
        return pointer;
    }

    public void clear() {
        Arrays.fill(values, null);
        pointer = 0;
    }
}
