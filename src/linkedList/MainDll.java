package linkedList;

public class MainDll {
    public static void main(String[] args) {
        doublyLinkList list=new doublyLinkList();
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(67);
        list.insertFirst(56);
        list.insertFirst(99);
        list.insertLast(98);
        list.insertIndex(98,65);
        list.display();
    }
}
