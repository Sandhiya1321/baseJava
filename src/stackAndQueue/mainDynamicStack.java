package stackAndQueue;

public class mainDynamicStack {
    public static void main(String[] args) throws stackException {
        customStack stack1=new dynamicStack();
        dynamicStack stack=new dynamicStack();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(67);
        stack.display();
        stack1.push(12);
        stack1.push(23);
        stack1.push(34);
        stack1.push(45);
        stack1.push(56);
        stack1.push(67);

        stack1.display();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
        System.out.println();
        System.out.println();
        System.out.println("Custom Oneee!!!!!");
        stack1.pop();
        stack1.pop();
        stack1.display();
    }
}
