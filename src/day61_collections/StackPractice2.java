package day61_collections;

import java.util.Stack;

public class StackPractice2 {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.push(20);
        stack.add(50);
        stack.add(100);
        stack.add(80);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
