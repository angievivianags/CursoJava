package colecciones;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEjemplo {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(1000);
        priorityQueue.add(200);
        priorityQueue.add(2000);
        priorityQueue.offer(11000);
        System.out.println(priorityQueue.toString());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.toString());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.toString());
    }
}
