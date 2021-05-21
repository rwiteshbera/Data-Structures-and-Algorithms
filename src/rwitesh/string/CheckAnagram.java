/*Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.*/
package rwitesh.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    static boolean Anagram(String st1, String st2)
    {
        if(st1.length()!=st2.length())
        {
            return false;
        }
        char[] c1 = st1.toCharArray();
        char[] c2 = st2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        st1 = new String(c1);
        st2 = new String(c2);

        return (st1.equals(st2));
    }
    public static void main(String[] args) {
        String st1, st2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two string");
        st1 = sc.nextLine();
        st2 = sc.nextLine();

        if(Anagram(st1,st2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}

//Time Complexity is : O(nlogn)
//because the sorting funciton take nlogn time