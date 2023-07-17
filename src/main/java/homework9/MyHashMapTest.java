package homework9;

public class MyHashMapTest {
    public static void main(String[] args) {
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
