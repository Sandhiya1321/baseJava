package linkedList;

public class cycleLength {
    private Node head;
    private Node tail;
    private int size;
    public cycleLength(){
        this.size=0;
    }
    private static class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
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
    public int length(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast == slow){
                Node temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    public Node getHead(){
        return head;
    }
    public static void main(String[] args) {
        cycleLength list = new cycleLength();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        // Creating a cycle manually
        Node head = list.getHead();
        Node temp = head;
        Node joinNode = null;
        int pos = 2; // cycle starts at index 2
        int index = 0;

        while (temp.next != null) {
            if (index == pos) {
                joinNode = temp;
            }
            temp = temp.next;
            index++;
        }
        temp.next = joinNode; // Creating the cycle

        int cycleLen = list.length(head);
        if (cycleLen > 0) {
            System.out.println(cycleLen);
        } else {
            System.out.println("No cycle ");
        }
    }

}
