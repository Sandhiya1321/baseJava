package linkedList;

public class MainRecur {
    public static void main(String[] args) {
        llRecursion list=new llRecursion();
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(45);
        list.insertFirst(65);
        list.display();
        list.ins(89,2);
        list.ins(45,3);
        list.display();
        cycleLength list1=new cycleLength();
        list1.insertFirst(12);
        list1.insertFirst(23);
        list1.insertFirst(45);
        list1.insertFirst(65);
        list1.display();
    }

}
