package homework9;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Ukraine");
        myQueue.add("Germany");
        myQueue.add("Italy");

        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.poll() = " + myQueue.poll());

        System.out.println("myQueue.size() = " + myQueue.size());

        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());
    }
}
