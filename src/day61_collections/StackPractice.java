package day61_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>(); //LIFO
        stack.push("a");//adds element
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println("top: " + stack.peek());
        stack.pop();//removes and returns the element on top
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
