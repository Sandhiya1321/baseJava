package stackAndQueue;

public class mainQueueUsingRemoveEff {
    public static void main(String[] args) {
        QueueUsingStackRemoveEff list=new QueueUsingStackRemoveEff();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(67);

        System.out.println(list.peek());
        System.out.println(list.remove());
        System.out.println(list.peek());
    }
}