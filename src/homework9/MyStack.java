package homework9;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] values;
    private int pointer = 0;

    public MyStack() {
        this.values = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(Object value) {
        if (pointer == values.length - 1) {
            resize(values.length * 2);
        }
        values[pointer] = (E) value;
        pointer++;
    }

    private void resize(int newLength) {
        Object[] newValues = new Object[newLength];
        System.arraycopy(values, 0, newValues, 0, pointer);
        values = (E[]) newValues;
    }

    public void remove(int index) {
        if (index < 0 || index >= pointer) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        values[index] = null;
        for (int i = index; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        pointer--;
    }

    public E pop() {
        if (pointer == 0) {
            throw new EmptyStackException();
        }
        E item = values[--pointer];
        System.arraycopy(values, 0, values, 0, pointer);
        values[pointer] = null;
        return item;
    }
    public E peek() {
        return values[pointer - 1];
    }

    public void clear() {
        if (pointer == 0) {
            throw new EmptyStackException();
        }
        Arrays.fill(values, null);
        pointer = 0;
    }

    public int size() {
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null){
                counter++;
            }
        }
        return counter;
    }
}
