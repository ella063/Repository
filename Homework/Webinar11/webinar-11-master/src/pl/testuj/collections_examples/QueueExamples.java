package pl.testuj.collections_examples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// UWAGA set (zbiór) operuje tylko na obiektach, nie można używać typów prostych
public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> usersQueue = new PriorityQueue<>();

        usersQueue.add("Wojtek");
        usersQueue.add("Wiola");
        usersQueue.add("Julia");
        usersQueue.add("Adam");

        System.out.println(usersQueue);

        // metoda poll() - zwraca pierwszy element i usuwa go z kolejki
        System.out.println(usersQueue.poll());
        System.out.println(usersQueue);

        Queue<String> usersQueue2 = new LinkedList<>();
        usersQueue2.add("Wojtek");
        usersQueue2.add("Wiola");
        usersQueue2.add("Julia");
        usersQueue2.add("Adam");

        System.out.println(usersQueue2);
        // metoda poll() - zwraca pierwszy element i usuwa go z kolejki
        System.out.println(usersQueue2.poll());
        System.out.println(usersQueue2);

    }
}
