package homework9;

public class MyArrayListTest {
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
    }
}
