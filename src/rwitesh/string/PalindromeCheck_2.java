package rwitesh.string;

import java.util.Scanner;

public class PalindromeCheck_2 {
    public static boolean Palindrome(String st)
    {
        int i=0, j=st.length()-1;
        while(j>=i)
        {
            if(st.charAt(i)!=st.charAt(j)) {
                return false;
            }
           i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st;
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();

        if(Palindrome(st))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
