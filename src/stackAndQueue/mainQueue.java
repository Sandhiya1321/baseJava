package stackAndQueue;

public class mainQueue {
    public static void main(String[] args) throws Exception {
        customQueue queue=new customQueue(5);

        queue.insert(12);
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);
        queue.insert(56);
        queue.insert(67);
        queue.display();

        System.out.println(queue.remove());

        queue.display();
        System.out.println(queue.front());
    }
}
