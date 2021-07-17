package rwitesh.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckForBalancedParentheses {
    static boolean Matching(char a, char b){
        return
        (
                (a=='(' && b==')')   ||
                (a=='{' && b=='}') ||
                (a=='[' && b==']')
        );
    }
    static boolean isBalanced(String str){
        Deque<Character>s = new ArrayDeque<>();

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }

// If current character is not an opening
// bracket, then it must be closing. So stack cannot be empty at this point,
// hence it will return false.
            else if(s.isEmpty()){
                return false;
            }
            else if(!Matching(s.peek(), x)){
                return false;
            }
            else{
                s.pop();
            }
        }

        return (s.isEmpty());
    }

    public static void main(String[] args) {
        String str = "]";

        if(isBalanced(str)){
            System.out.println("Balanced.");
        }
        else{
            System.out.println("Not Balanced.");
        }
    }
}
