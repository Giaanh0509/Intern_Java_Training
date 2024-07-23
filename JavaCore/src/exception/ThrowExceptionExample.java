package exception;

public class ThrowExceptionExample {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
    public static void main(String[] args) {
            checkAge(15);
    }
}
