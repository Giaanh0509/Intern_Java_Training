package stringarraydate;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        System.out.println("Length of the array: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
