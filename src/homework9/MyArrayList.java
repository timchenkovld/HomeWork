package homework9;

import java.util.Arrays;

public class MyArrayList<E> implements MyListMethods<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private final int CUT_RATE = 5;
    private int pointer = 0;
    private Object[] values;

    public MyArrayList() {
        this.values = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(E item) {
        if (pointer == values.length - 1) {
            resize(values.length * 2);
        }
        values[pointer++] = item;
    }

    private void resize(int newLength) {
        Object[] newValues = new Object[newLength];
        System.arraycopy(values, 0, newValues, 0, pointer);
        values = newValues;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            values[i] = values[i + 1];
        }
        values[pointer] = null;
        pointer--;

        if (values.length > DEFAULT_CAPACITY && pointer < values.length / CUT_RATE) {
            resize(values.length / 2);
        }
    }

    @Override
    public E get(int index) {
        return (E) values[index];
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void clear() {
        Arrays.fill(values, null);
        pointer = 0;
    }
}
