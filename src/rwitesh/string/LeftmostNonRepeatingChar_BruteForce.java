package rwitesh.string;
//Given a string. Find the first repeated character present first
//in the string otherwise return -1;

import java.util.Scanner;

public class LeftmostNonRepeatingChar_BruteForce {
    static int LeftMost(String st){
        for(int i=0; i<st.length(); i++)
        {
            boolean flag = false;
            for(int j=i+1; j<st.length(); j++)
            {
                if (st.charAt(i)==st.charAt(j))
                {
                    flag = true;
                    break;
                }
            }

            if (flag==false)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.next();

        System.out.println("Leftmost character at: " + LeftMost(st));
    }
}
