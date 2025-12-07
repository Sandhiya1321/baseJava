package Heaps;


import java.util.ArrayList;

//compare two objects
public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }

    private void swap(int first,int sec){
        T temp=list.get(first);
        list.set(first,list.get(sec));
        list.set(sec, temp);
    }

    private int par(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return (2*index)+1;
    }

    private int right(int index){
        return (2*index)+2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if(index==0) return;
        int p=par(index);

        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }
        T temp=list.get(0);
        T last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min=index;
        int left=left(index);
        int right=right(index);
        if(left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min=left;
        }

        if(right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }

}



class main{
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap=new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        heap.insert(13);
        heap.insert(23);
        System.out.println(heap.remove());
    }
}
