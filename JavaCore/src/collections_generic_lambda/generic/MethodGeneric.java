package collections_generic_lambda.generic;

public class MethodGeneric {
        public static <T> void printArray(T[] inputArray) {
            for (T element : inputArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            Character[] charArray = {'A', 'B', 'C', 'D', 'E'};

            System.out.println("Array of Integers:");
            printArray(intArray);

            System.out.println("Array of Characters:");
            printArray(charArray);
        }
}
