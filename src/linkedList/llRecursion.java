package linkedList;
//time complexity O(n)
public class llRecursion {
    private Node head;
    private Node tail;
    private int size;
    public llRecursion(){
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
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void ins(int val,int index){
        head=insert(val,index,head);
    }
    //while tail and size is not available
    private Node insert(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insert(val,index-1,node.next);
        return node;
    }
    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"---> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}
