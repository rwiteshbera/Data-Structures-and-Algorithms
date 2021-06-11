package rwitesh.string;

import java.util.Scanner;

public class SubsequenceOfString {
    static void PowerSet(String st, int i, String current)
    {
        if (i==st.length()) System.out.println(current);
        else {
            PowerSet(st, i+1, current+st.charAt(i));
            PowerSet(st, i+1, current);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String st = sc.next();

        PowerSet(st,0,"");
    }
}
