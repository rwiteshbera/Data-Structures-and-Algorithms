package rwitesh.string;
//Time Complexity of this solution is O(N^2)

//The input string is geeksforgeeks
//The length of the longest non-repeating character substring is 7

import java.util.Scanner;

public class LongestSubstringWithDistinctChar_Efficient {
    static int FindSubString(String st)
    {
        int res = 0;
        for(int i=0; i<st.length(); i++)
        {
            boolean[] visited = new boolean[256];
            for(int j=i; j<st.length(); j++)
            {
                if (visited[st.charAt(j)]==true)
                {
                    break;
                }
                else{
                    res = Math.max(res,j-i+1);
                    visited[st.charAt(j)]=true;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String st = sc.next();

        System.out.println(FindSubString(st));
    }
}
