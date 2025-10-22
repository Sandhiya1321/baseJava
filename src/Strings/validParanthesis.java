package Strings;

import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty())
                    return false;
                char first=stack.pop();
                if((ch==')'&&first!='(')||(ch==']'&&first!='[')||(ch=='}'&&first!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()(()))";
        System.out.println(isValid(str));
    }
}
