package homework9;

public interface MyListMethods<E> {
    void add(E item);

    void remove(int index);

    E get(int index);

    int size();

    void clear();
}
