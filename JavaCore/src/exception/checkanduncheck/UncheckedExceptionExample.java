package exception.checkanduncheck;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            // This line will throw ArrayIndexOutOfBoundsException
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

