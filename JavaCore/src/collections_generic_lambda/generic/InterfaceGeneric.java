package collections_generic_lambda.generic;

public class InterfaceGeneric {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("One", 1);
        Pair<String, String> p2 = new OrderedPair<>("Hello", "World");

        System.out.println("Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + ", Value: " + p2.getValue());
    }
}

