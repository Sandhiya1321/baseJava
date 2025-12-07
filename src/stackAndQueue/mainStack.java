package stackAndQueue;

public class mainStack {
    public static void main(String[] args) throws stackException {
        customStack stack=new customStack(5);
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(56);

        stack.display();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
