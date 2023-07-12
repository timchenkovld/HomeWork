package homework9;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Vlad");
        myLinkedList.add("Dima");
        myLinkedList.add("Sasha");

        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(1));

        myLinkedList.remove(2);
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
    }
}
