package collections_generic_lambda.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach(number -> System.out.print(number + " "));

        System.out.println("\n");

        numbers.forEach(number -> {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        });

        System.out.println("\n");

        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");

        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println("Sorted names: " + names);

        names.sort((name1, name2) -> name2.compareTo(name1));
        System.out.println("Reverse sorted names: " + names);
    }
}
