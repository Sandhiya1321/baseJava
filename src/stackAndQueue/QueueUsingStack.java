package stackAndQueue;
import java.util.Stack;


public class QueueUsingStack {
    //insert efficient
    private Stack<Integer> one;
    private Stack<Integer> two;
    public QueueUsingStack(){
        one=new Stack<>();
        two=new Stack<>();
    }
    public void add(int val) {
        one.push(val);
    }
    public int rem() throws Exception{
        while(!one.isEmpty()){
            two.push(one.pop());
        }
        int removed=two.pop();
        while(!two.isEmpty()){
            one.push(two.pop());
        }
        return removed;
    }
    public int peek() throws Exception{
        while(!one.isEmpty()){
            two.push(one.pop());
        }
        int peeked=two.peek();
        while(!two.isEmpty()){
            one.push(two.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
       return one.isEmpty();
    }

}
