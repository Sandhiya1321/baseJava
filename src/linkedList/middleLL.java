package linkedList;

public class middleLL {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        private int val;
        private Node next;
        public  Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    public void insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public Node mid(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        middleLL list=new middleLL();
        list.insert(56);
        list.insert(67);
        list.insert(78);
        list.insert(89);
        list.insert(90);
        list.insert(100);
        list.display();
        Node middle = list.mid(list.head);
        System.out.println(middle.val);



    }
}
