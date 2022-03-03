import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SampleQueue {


    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        // Ajouter un String à la file d'attente

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");

        String current;
        System.out.println("LinkedList");

        while ((current = queue.poll()) != null) {

            System.out.println(current);

        }


        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("One");
        priorityQueue.offer("Two");
        priorityQueue.offer("Three");
        priorityQueue.offer("Four");
        priorityQueue.offer("Five");

        System.out.println("PriorityQueue");
        while ((current = priorityQueue.poll()) != null) {

            System.out.println(current);

        }


    }

}
