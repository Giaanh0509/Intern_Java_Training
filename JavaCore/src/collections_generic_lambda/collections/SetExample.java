package collections_generic_lambda.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element

        System.out.println("Set Elements:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.remove("Banana");
        System.out.println("Set after removing 'Banana': " + set);
    }
}

