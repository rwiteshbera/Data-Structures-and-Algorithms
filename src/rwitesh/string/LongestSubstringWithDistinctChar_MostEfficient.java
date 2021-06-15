package rwitesh.string;

//The input string is geeksforgeeks
//The length of the longest non-repeating character substring is 7


import java.util.Scanner;

public class LongestSubstringWithDistinctChar_MostEfficient {
    static int FindSubString(String s)
    {
       int result = 0;
       int[] cache = new int[256];

       for(int i=0, j=0; i<s.length(); i++)
       {
           if (cache[s.charAt(i)]>0)
           {
               j = Math.max(j,cache[s.charAt(i)]);
           }
           cache[s.charAt(i)] = i+1;
           result = Math.max(result,i-j+1);
       }

       return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String st = sc.next();

        System.out.println(FindSubString(st));
    }
}
