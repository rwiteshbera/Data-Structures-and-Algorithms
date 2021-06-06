package rwitesh.string;

import java.util.Scanner;

public class PalindromeCheck {
     public static Boolean palindrome(String st)
    {
        StringBuilder rev = new StringBuilder(st);
        rev.reverse();
        return st.equals(rev.toString());
    }
    public static void main(String[] args) {
        String st;
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        st = sc.next();
//        System.out.println(palindrome(st));

        if(palindrome(st))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("No a palindrome");
        }
    }
}
