package linkedList;

public class MainClL {
    public static void main(String[] args) {
        circularLinkedList list=new circularLinkedList();
        list.insert(8);
        list.insert(67);
        list.insert(5);
        list.insert(45);
        list.display();
        list.delete(5);
        list.display();
    }
}
