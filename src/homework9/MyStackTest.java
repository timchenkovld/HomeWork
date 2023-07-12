package homework9;

public class MyStackTest {
    public static void main(String[] args) {
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
    }
}
