package collections_generic_lambda.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue Elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

