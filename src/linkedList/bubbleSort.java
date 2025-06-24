package linkedList;

public class bubbleSort {
    private Node head;
    private Node tail;
    private int size;
    public bubbleSort(){
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
    private Node getNodeAt(int index) {
        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void sort(){
        sort(size-1,0);
    }

    private void sort(int row, int coln) {
        if(row==0){
            return;
        }
        if(coln<row){
            Node first=getNodeAt(coln);
            Node second=getNodeAt(coln+1);
            if (first != null && second != null && first.val > second.val) {
                // Swapping references
                if (first == head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                } else {
                    Node prev = getNodeAt(coln - 1);
                    if (prev != null) {
                        prev.next = second;
                        first.next = second.next;
                        second.next = first;
                    }
                }

                // Tail adjustment if needed
                if (second.next == null) {
                    tail = second;
                } else if (first.next == null) {
                    tail = first;
                }
            }

            sort(row, coln + 1);
        } else {
            sort(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        bubbleSort list = new bubbleSort();

        list.insertFirst(20);
        list.insertFirst(90);
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(70);
        list.display();
        list.sort();
        list.display();
    }
}
