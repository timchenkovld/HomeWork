package homework9;


public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("Kyiv");
        myArrayList.add("London");
        myArrayList.add("Berlin");
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("myArrayList.get(0) = " + myArrayList.get(0));
        System.out.println("myArrayList.get(1) = " + myArrayList.get(2));

        myArrayList.remove(1);

        System.out.println("myArrayList.size() = " + myArrayList.size());

        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("-------------------------------------");

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

        System.out.println("-------------------------------------");

        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Ukraine");
        myQueue.add("Germany");
        myQueue.add("Italy");

        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.poll() = " + myQueue.poll());

        System.out.println("myQueue.size() = " + myQueue.size());

        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("-------------------------------------");

        MyStack<String> myStack = new MyStack<>();
        myStack.push("Kharkiv");
        myStack.push("Kyiv");
        myStack.push("Lviv");

        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());

        myStack.remove(1);
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());

        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("-------------------------------------");

        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Kyiv", "Ukraine");
        myHashMap.put("Berlin", "Germany");
        myHashMap.put("Madrid", "Spain");

        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(1) = " + myHashMap.get("Berlin"));

        myHashMap.remove("Madrid");
        System.out.println("myHashMap.size() = " + myHashMap.size());

        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
    }
}
