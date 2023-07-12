package homework9;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {
        this.tail = new Node<E>(null, head, null);
        this.head = new Node<E>(null, null, tail);
    }
    public void add(E value){
        Node<E> prev = tail;
        prev.setData(value);
        tail = new Node<>(null, prev, null);
        prev.setPrev(tail);
        size++;
    }

    public void remove (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            head.setNext(head);
            head.setPrev(null);
            size--;
            return;
        }
        Node<E> target = tail.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
            Node<E> previous = target.prev;
            Node<E> next = target.next;
            previous.setNext(next);
            next.setPrev(previous);
            size--;
            return;
        }
    }
    public E get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node<E> target = tail.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getData();
    }
    private Node<E> getNextElement(Node<E> target){
        return target.getNext();
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
