package homework9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Kyiv");
        list.add("London");
        list.add("Berlin");

        System.out.println(list.get(0));
        System.out.println(list.get(2));

        list.remove(1);

        System.out.println("list.size() = " + list.size());

        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}
