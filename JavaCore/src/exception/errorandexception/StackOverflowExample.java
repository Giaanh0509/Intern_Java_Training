package exception.errorandexception;

public class StackOverflowExample {
    public static void main(String[] args) throws StackOverflowError{
        recursiveMethod();
    }

    public static void recursiveMethod() {
        // This method calls itself indefinitely
        recursiveMethod();
    }
}


