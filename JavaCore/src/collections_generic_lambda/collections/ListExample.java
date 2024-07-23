package collections_generic_lambda.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List Elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("Element at index 1: " + list.get(1));
        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);
    }
}

