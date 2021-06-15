package rwitesh.string;
//Time Complexity will be O(N^3)

//The input string is geeksforgeeks
//The length of the longest non-repeating character substring is 7

import java.util.Scanner;

public class LongestSubstringWithDistinctChar {
    static boolean areDistinct(String st, int start, int end)
    {
        boolean[] b = new boolean[256];
        for(int i = start; i<=end; i++)
        {
            if (b[st.charAt(i)])
            {
                return false;
            }
            b[st.charAt(i)]=true;
        }
        return true;
    }

    static int LongestSubstringFinder(String st)
    {
        int res = 0;
        for(int i=0; i<st.length(); i++)
        {
            for(int j=i; j<st.length(); j++)
            {
                if (areDistinct(st, i, j))
                {
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        System.out.println(LongestSubstringFinder(st));
    }
}
