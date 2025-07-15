package stackAndQueue;

public class mainQueueUsingStack {
    public static void main(String[] args) throws Exception {
        QueueUsingStack list=new QueueUsingStack();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(67);
        System.out.println(list.peek());
        System.out.println(list.rem());
        System.out.println(list.peek());
    }
}
