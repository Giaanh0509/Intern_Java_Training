package collections_generic_lambda.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack Elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

