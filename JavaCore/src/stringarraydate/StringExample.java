package stringarraydate;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        String emptyString = "";
        String nullString = null;

        int length = greeting.length();
        System.out.println("Length of the greeting: " + length);

        String name = "John";
        String message = greeting + " My name is " + name + ".";
        System.out.println("Concatenated string: " + message);

        boolean isEmpty = emptyString.isEmpty();
        System.out.println("Is the emptyString empty? " + isEmpty);

        String anotherGreeting = "Hello, World!";
        boolean isEqual = greeting.equals(anotherGreeting);
        System.out.println("Are the greetings equal? " + isEqual);

        String greetingWithDifferentCase = "hello, world!";
        boolean isEqualIgnoreCase = greeting.equalsIgnoreCase(greetingWithDifferentCase);
        System.out.println("Are the greetings equal ignoring case? " + isEqualIgnoreCase);

        String sub = greeting.substring(7, 12);
        System.out.println("Substring: " + sub);

        String upperCaseGreeting = greeting.toUpperCase();
        String lowerCaseGreeting = greeting.toLowerCase();
        System.out.println("Uppercase: " + upperCaseGreeting);
        System.out.println("Lowercase: " + lowerCaseGreeting);

        String replacedGreeting = greeting.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedGreeting);

        String[] words = greeting.split(" ");
        System.out.println("Words in the greeting:");
        for (String word : words) {
            System.out.println(word);
        }

        String stringWithSpaces = "  Hello, World!  ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
    }
}

