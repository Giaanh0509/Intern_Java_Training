package exception.userdefined;

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(150);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }
}

