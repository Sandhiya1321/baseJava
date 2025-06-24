package linkedList;

public  class MainSll {
        public static void main(String[] args) {
            singlyLinkedList list=new singlyLinkedList();
            list.insertFirst(8);
            list.insertFirst(9);
            list.insertFirst(7);
            list.insertFirst(67);
            list.insertFirst(56);
            list.insertLast(99);
            list.insertIndex(234,4);
            list.display();
            System.out.println(list.deleteFirst());
            list.display();
            System.out.println(list.deleteLast());
            //LIFO
            list.display();
            System.out.println(list.deleteIndex(2));
            list.display();
            System.out.println(list.find(7));
        }
}