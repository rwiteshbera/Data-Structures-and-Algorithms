package rwitesh.string;

import java.util.Scanner;

public class LeftmostNonRepeatingChar_Efficient {
    static int LeftMost(String st)
    {
        int[] count = new int[256];

        for(int i=0; i<st.length(); i++){
            count[st.charAt(i)]++;
        }

        for(int j=0; j<st.length(); j++)
        {
            if (count[st.charAt(j)]==1)
            {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.next();

        if(LeftMost(st)!=-1)
        {
            System.out.println("Leftmost Character is: " + st.charAt(LeftMost(st)));
        }
        else {
            System.out.println("-1");
        }
    }
}
