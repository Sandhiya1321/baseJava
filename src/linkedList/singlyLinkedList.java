package linkedList;

public class singlyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public singlyLinkedList(){
        this.size=0;
    }
    private class Node{
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
    //inserting element at start or before head
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }
    //inserting element at last or after tail
    //time complexity is constant O(1)
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    //inserting element at any given index
    public void insertIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    //if we don't have tail traverse till end which is equal to null place the node there
    //time complexity O(n)
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"---> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    //delete element at first
    public int deleteFirst(){
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public Node getIndex(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    //delete element at last
    //time complexity O(N)
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node seconLast=getIndex(size-2);
        int value=tail.val;
        tail=seconLast;
        tail.next=null;
        return value;
    }
    //delete at particular index
    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=getIndex(index-1);
        int value=prev.next.val;
        prev.next=prev.next.next;
        return value;
    }
    //find a value
    public Node find(int val){
        Node node=head;
        while(node!=null) {
           if(node.val==val){
               return node;
           }
           node=node.next;
        }
        return null;
    }
}
