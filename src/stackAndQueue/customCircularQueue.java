package stackAndQueue;

public class customCircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int head=0;
    private int size=0;
    public customCircularQueue(){
        this(DEFAULT_SIZE);
    }
    public customCircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
           return false;
        }
        data[end++]=item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty cannot remove");
        }
        int removed=data[head++];
        head = head%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[head];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty queue");
            return;
        }
       int i=head;
       do{
           System.out.print(data[i]+"-->");
           i++;
           i%=data.length;
       }while(i!=end);
        System.out.println("end");
    }
}
