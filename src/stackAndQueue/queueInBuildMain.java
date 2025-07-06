package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class queueInBuildMain {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(12);
        queue.add(23);
        queue.add(34);
        queue.add(45);
        queue.add(56);
        queue.add(67);

        System.out.println(queue.peek());//retrieves but does not remove the head
        System.out.println("removed head:"+queue.remove());

    }
}
