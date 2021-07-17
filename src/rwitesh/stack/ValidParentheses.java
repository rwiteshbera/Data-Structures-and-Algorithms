package rwitesh.stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x=='('){
                stack.push(')');
            }
            else if(x=='{'){
                stack.push('}');
            }
            else if(x=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=x){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String x = "({[]})";
        if(isValid(x)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
