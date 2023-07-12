package homework9;

import java.util.Arrays;

public class MyHashMap<K, V> {
    private Entry<K, V>[] table;
    private int capacity = 16;
    private int size = 0;

    public MyHashMap() {
        this.table = new Entry[capacity];
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Ключ не може бути null");
        }
        if (size == table.length) {
            increaseCapacity();
        }
        putValue(key, value);
        size++;
    }

    private void putValue(K key, V value) {
        int index = index(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> prev = null;
            Entry<K, V> current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (prev == null) {
                        newEntry.next = current.next;
                        table[index] = newEntry;
                        return;
                    } else {
                        newEntry.next = current.next;
                        prev.next = newEntry.next;
                        return;
                    }
                }
                prev = current;
                current = current.next;
            }
            prev.next = newEntry;
        }
    }

    private void increaseCapacity() {
        Entry<K, V>[] newTable = Arrays.copyOf(table, table.length);
        table = new Entry[table.length * 2];
        for (Entry<K, V> entry : newTable) {
            if (entry != null) {
                putValue(entry.key, entry.value);
            }
        }
    }


    public V get(K key) {
        int index = index(key);
        if (table[index] == null) {
            return null;
        }
        Entry<K, V> target = table[index];
        while (target != null) {
            if (target.key.equals(key)) {
                return target.value;
            }
            target = target.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = index(key);
        Entry<K, V> prev = null;
        Entry<K, V> target = table[index];
        while (target != null) {
            if (target.key.equals(key)) {
                if (prev == null) {
                    target = target.next;
                    table[index] = target;
                    size--;
                    return;
                } else {
                    prev.next = target.next;
                    size--;
                    return;
                }
            }
            prev = target;
            target = target.next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Entry[capacity];
        size = 0;
    }

    private int index(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }
}

