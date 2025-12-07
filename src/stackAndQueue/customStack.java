package stackAndQueue;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int pointer=-1;
    public customStack(){
        this(DEFAULT_SIZE);
        //this type of "this" is used to call the another constructor with the constructor
    }
    public customStack(int size){
        this.data=new int[size];
    }
    public boolean push(int val){
        if (isFull()) {
            System.out.println("Stack is occupied");
            return false;
        }
        pointer++;
        data[pointer]=val;
        return true;
    }
    //custom exception
    public int pop() throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot pop an element from empty stack");
        }
        /* public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop an element from empty stack");
        }*/
        int deleted=data[pointer];
        pointer--;
        return deleted;
        //return data[pointer--];
    }
    //custom exception
    public int peek() throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot peek an element from empty stack");
        }
        /* public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop an element from empty stack");
        }*/
        return data[pointer];
    }
//pointer at last index
    public boolean isFull() {
        return pointer==data.length-1;
    }
    //when the stack is empty
    public boolean isEmpty() {
        return pointer==-1;
    }
    public void display(){
        for (int i = 0; i < pointer; i++) {
            System.out.print(data[i]+"-->");
        }
        System.out.println("End");
    }
}
