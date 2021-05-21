package rwitesh.string;

import java.util.Scanner;

public class CheckingStringSubsequenceWithOther {
    static boolean Subsequence(String st1, String st2)
    {
        int j = 0;
        for(int i=0 ; i<st1.length() && j<st2.length(); i++)
        {
            if(st1.charAt(i) == st2.charAt(j))
            {
                j++;
            }
        }
        return j==st2.length();
    }
    public static void main(String[] args) {
        String st1, st2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string: ");
        st1 = sc.nextLine();
        st2 = sc.nextLine();

        if(Subsequence(st1,st2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
