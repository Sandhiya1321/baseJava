package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueInBuild {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(12);
        deque.addLast(23);
        deque.addFirst(34);
        deque.addFirst(45);
        deque.addFirst(56);
        deque.addLast(67);
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.poll());
        System.out.println(deque.peek());
    }
}
