package linkedList;

public class reverseLLRecur {
    private Node head;
    private Node tail;
    private int size;
    private static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"---> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public static void main(String[] args) {
        reverseLLRecur list = new reverseLLRecur();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();
        list.reverse(list.head);
        list.display();
    }
}
