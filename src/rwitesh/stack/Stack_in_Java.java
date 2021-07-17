package rwitesh.stack;

import java.util.Stack;

public class Stack_in_Java {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);

        s.peek();
        s.pop();
        s.peek();

    }
}
