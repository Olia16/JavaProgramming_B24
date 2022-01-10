package day61_collections;

import java.util.ArrayDeque;

public class QueueExample2 {
    public static void main(String[] args) { //first in first out
        ArrayDeque<String> object = new ArrayDeque<>();
        object.offer("z");
        object.offer("hello");
        object.offer("turkey");
        System.out.println(object);
        System.out.println(object.peek()); //element method could be used
        System.out.println(object.poll()); // remove method
        System.out.println(object);
        System.out.println(object.peek());
       // object.offer(null); cannot store null in queues

        object.addFirst("birds");
        object.addLast("water");
        System.out.println(object);
    }
}
