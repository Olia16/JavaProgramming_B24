package day61_collections;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        System.out.println(queue);//prints in natural/sorted order
        System.out.println(queue.peek());
        System.out.println(queue.poll()); //removes and returns the first element
        System.out.println(queue);
        queue.offer(5);
        System.out.println(queue);
        queue.element();

        System.out.println();

       // System.out.println(new PriorityQueue<>().remove()); -> causes an exception
        System.out.println(new PriorityQueue<>().poll()); //returns null
    }
}
