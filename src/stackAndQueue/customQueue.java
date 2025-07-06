package stackAndQueue;

public class customQueue {
    private int[] data;

    private static final int DEFAULT_SIZE=10;
    int end=0;
    public customQueue(){
        this(DEFAULT_SIZE);
    }
    public customQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int val) {
        if(isFull()){
            return false;
        }

        data[end++]=val;
        return true;
    }
    public int remove () throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty!!");
        }
        int removed=data[0];
        //shift the elements
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <--");
        }
        System.out.println("End");
    }
    //display the element at first
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
}
