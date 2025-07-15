package stackAndQueue;

import java.util.Stack;

public class QueueUsingStackRemoveEff {
    private Stack<Integer> one;
    private Stack<Integer> two;

    public QueueUsingStackRemoveEff(){
        one=new Stack<>();
        two=new Stack<>();
    }
    public void add(int val){
        while(!one.isEmpty()){
            two.push(one.pop());
        }
        one.push(val);
        while(!two.isEmpty()){
            one.push(two.pop());
        }
    }
    public int remove(){
        return one.pop();
    }
    public int peek(){
        return one.peek();
    }
}
