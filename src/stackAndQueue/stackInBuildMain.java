package stackAndQueue;

import java.util.Stack;

public class stackInBuildMain {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(67);
        stack.push(78);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
