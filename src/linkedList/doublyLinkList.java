package linkedList;

public class doublyLinkList {
    private Node head;
    private int size;
    private class Node{
        private Node prev;
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
    public doublyLinkList(){
        this.size=0;
    }
   //insert in start
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+" ---> ");
            last=node;
            node=node.next;
        }
        System.out.println("NULL");
        while(last!=null){
            System.out.print(last.val+" --> ");
            last=last.prev;
        }
        System.out.println("NULL");
    }
    //insert in last
    //without tail
    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
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
    //insert element after the given value
    public void insertIndex(int after,int val){
        Node pre=find(after);
        if(pre==null){
            System.out.println("not exixts");
            return;
        }
        Node node=new Node(val);
        node.next=pre.next;
        pre.next=node;
        node.prev=pre;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
}