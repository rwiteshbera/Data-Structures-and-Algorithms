package rwitesh.string;

import java.util.Scanner;

public class CheckAnagramEfficientApproach {
    static boolean Anagram(String st1, String st2)
    {
        if(st1.length()!=st2.length())
        {
            return false;
        }

        int[] count = new int[256];

        for(int i=0; i<st1.length();i++)
        {
            count[st1.charAt(i)]++;
            count[st2.charAt(i)]--;
        }

        for(int i=0; i<256; i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
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
