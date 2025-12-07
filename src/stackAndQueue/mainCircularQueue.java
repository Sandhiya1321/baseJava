package stackAndQueue;

public class mainCircularQueue {
    public static void main(String[] args) throws Exception {
        customCircularQueue queue=new customCircularQueue(5);

        queue.insert(12);
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);
        queue.insert(56);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(45);
        queue.display();

        System.out.println(queue.remove());
        queue.display();

        queue.insert(9989);
        queue.display();


    }

}
