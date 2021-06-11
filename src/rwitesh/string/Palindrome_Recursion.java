package rwitesh.string;

//Time Complexity: O(N)
import java.util.Scanner;

public class Palindrome_Recursion {
    static boolean CheckPalindrome(String s, int l, int r){
        if (l>=r) return true;

        if (s.charAt(l)!=s.charAt(r)) return false;

        return CheckPalindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int l = 0, r = st.length()-1;

        System.out.println(CheckPalindrome(st,l,r));
    }
}
