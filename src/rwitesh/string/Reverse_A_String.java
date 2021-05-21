package rwitesh.string;

import java.util.Scanner;

public class Reverse_A_String {
    static void reverseString(char[] s)
    {
        int i=0, j=s.length-1;
        while (i<=j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String st;
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();

        char[] s = st.toCharArray();

        reverseString(s);

        for(int i=0 ; i<s.length; i++)
        {
            System.out.print(s[i]+"");
        }
    }
}
